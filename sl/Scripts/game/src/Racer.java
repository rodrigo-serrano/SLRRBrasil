package java.game;

import java.io.*;
import java.util.*;
import java.util.resource.*;
import java.render.*;	//Text
import java.render.osd.*;	//Text
import java.sound.*;

public class Racer extends GameType
{
	final static int	RID_FEJ = frontend:0x00dar;
	final static int	RID_COP		= frontend:0x000099EEr;
	final static int	RID_VINCE	= frontend:0x000099EFr;

	final static float	PRESTIGE_STEP = 0.05;

	final static int	PRESTIGE_SCALE = 300;	//a 0-1 tartomany ide skallazzuk fel!
	final static int	VHC_PRESTIGE_SCALE = 100;	//a 0-1 tartomany ide skallazzuk fel!

	//RAXAT: adjustable night race bet parameters
	final static int	MIN_BET		= 1000; //minimum bet
	final static int	BET_STEPS	= 10;
	final static int	BET_PINKS	= 0; //if we return this value, outside classes will recognize it as a pink slips bet
	final static float	BET_PRESTIGE_WEIGHT_RACER = 3; //how does racer prestige affects the bet
	final static float	BET_PRESTIGE_WEIGHT_VEHICLE = 0.3; //how does car prestige affects the bet
	final static float MIN_CAR_PRESTIGE_PINKS = GameLogic.ROC_MIN_CAR_PRESTIGE * 3.5; // minimum car prestige to allow pink slips

	Vehicle		car;
	String		name;

	RenderRef	render;
	ResourceRef	character;

	int		driverID;	//rendor, driver, player, etc gametype ids

	float	prestige;	//0..1;
	private int	money = 30000; //RAXAT: game must NOT allow other classes to modify this private int!
	int bet = MIN_BET; //RAXAT: night race bet
	int	club;

	int	lastRaceDay = -1;
	int	enabledPinkSlips = 0;

	float	bestQMtime=0.0;
	float	bestQMspd=0.0;

	//RAXAT: for future improvements
	int	gender; //0 - male, 1 - female

	int	type; //RAXAT: 0 - player, 1 - AI

	public Racer()
	{
		createNativeInstance();
	}

	//RAXAT: v2.3.1, safety patch
	public RenderRef getMarker() {return null;}

	//--------------------------------prestige szamitas-----------------------------------

	public void increasePrestige( float f )
	{
		float amount = (1.0-prestige)*f;
		float limit = 0.02*f/PRESTIGE_STEP;
		if( amount > limit )
			amount = limit;
		prestige+=amount;
	}

	public void decreasePrestige( float f )
	{
		float amount = prestige*f;
		float limit = 0.02*f/PRESTIGE_STEP;
		if( amount > limit )
			amount = limit;
		prestige-=amount;
	}

	//RAXAT: new proxy methods for all operations with racer's money
	public int getMoney()
	{
		return money;
	}

	public int setMoney(int amount)
	{
		if(amount >= 0) money = amount;
		else money = 0;

		return getMoney();
	}

	public int addMoney(int amount)
	{
		return setMoney(money+amount);
	}

	public int takeMoney(int amount)
	{
		return setMoney(money-amount);
	}

	public int getBet()
	{
		if(bet > money) return money;
		return bet;
	}

	public int calcBet()
	{
		int result = 0;
		float cprestige = getCarPrestige();
		float pprestige = prestige*PRESTIGE_SCALE;

		float mul_pp = pprestige/BET_PRESTIGE_WEIGHT_RACER;
		float mul_pc = cprestige/BET_PRESTIGE_WEIGHT_VEHICLE;

		if(mul_pp > 0.0 && mul_pc > 0.0) {
			float racerCalc = (mul_pp*BET_PRESTIGE_WEIGHT_VEHICLE);
			float vehicleCalc = (mul_pc*BET_PRESTIGE_WEIGHT_RACER);
			float resultCalc = (racerCalc*vehicleCalc+MIN_BET)*(club+1);
			result = (int) resultCalc;
		}

		boolean isGreenClub = (club+1 < 2);
		boolean canBePinks = (!isGreenClub && cprestige > MIN_CAR_PRESTIGE_PINKS);

		if(canBePinks && result > getMaxBet()) {
			return BET_PINKS;
		} else if(result < MIN_BET || money < bet) {
			return getMinBet();
		}

		if(!isGreenClub && result > money) result = money; //patch

		return result;
	}

	//RAXAT: minimum adviced bet, if player has less money than this, he can't participate in night drag races
	public int getMinBet()
	{
		return MIN_BET*(club+1)*2;
	}

	public int getMaxBet()
	{
		return MIN_BET*BET_STEPS*(club+1);
	}

	public float getCarPrestige()
	{
		if( car )
			return car.getPrestige();

		return 0.0;
	}

	public String getPrestigeString()
	{
		int pprestige, cprestige, aprestige;
		pprestige = prestige*PRESTIGE_SCALE;
		cprestige = getCarPrestige() * VHC_PRESTIGE_SCALE;

		aprestige = pprestige*0.5 + cprestige*0.5;

//		return aprestige + " (" + pprestige +  ":" + cprestige + ")";
		return pprestige +  "/" + cprestige;
	}

	//versenyzes pontszamitasa:
	public void calcPrestige( Racer challenged, int abandon, int iwon )
	{
		if( prestige != challenged.prestige )
			if( prestige < challenged.prestige )
			{
				increasePrestige(PRESTIGE_STEP);
				challenged.decreasePrestige(PRESTIGE_STEP);
			}
			else
			{
				decreasePrestige(PRESTIGE_STEP);
				challenged.increasePrestige(PRESTIGE_STEP);
			}

		if( abandon )
		{
			challenged.decreasePrestige(PRESTIGE_STEP);
		}
		else
		{
			if( iwon )
			{
				increasePrestige(2*PRESTIGE_STEP);
				challenged.decreasePrestige(2*PRESTIGE_STEP);
			}
			else
			{
				decreasePrestige(2*PRESTIGE_STEP);
				challenged.increasePrestige(2*PRESTIGE_STEP);
			}
		}
	}

	public void save( File saveGame )
	{
		//ToDo: save name_seed, (current)car, club, prestige, money, etc.
//		car.save( saveGame );

		int save_ver = 1;
		saveGame.write(save_ver);
		if (save_ver >= 1)
		{
			// dummy save_ver for further compatibility
		}
	}

	public void load( File saveGame )
	{
//		car.load( saveGame );

		int save_ver;
		save_ver = saveGame.readInt();

		if (save_ver >= 1)
		{
			// dummy save_ver for further compatibility
		}
	}
}