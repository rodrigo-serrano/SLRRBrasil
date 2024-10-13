package java.game;

import java.io.*;
import java.util.*;
import java.util.resource.*;
import java.render.*;
import java.render.osd.*;
import java.render.osd.dialog.*;
import java.sound.*;

//this dialog allows to adjust bets in night drag races
public class BetDialog extends Dialog
{
	final static int	CMD_OK		= 0;
	final static int	CMD_CANCEL	= 1;
	final static int	CMD_SLIDER	= 100;
	
	final static String	STR_PLACE_BET	= "DE SUA APOSTA";
	final static String	STR_BET			= "Aposta";
	final static String	STR_PINKS		= "CHAVE NA CHAVE";
	final static String	STR_OK			= "OK";
	final static String	STR_CANCEL		= "CANCELAR";
	
	ResourceRef charset = Frontend.largeFont;
	
	float spacing;
	Slider	sld;
	Style	sld_k	= new Style(0.04, 0.0525, Frontend.mediumFont, Text.ALIGN_RIGHT, new ResourceRef(Osd.RID_SLD_KNOB));
	Style	sld_h	= new Style(0.7, 0.03,   Frontend.mediumFont, Text.ALIGN_LEFT,  new ResourceRef(Osd.RID_SLD_BACK));
	
	int bet = GameLogic.player.getBet(); //player's bet
	int targetBet; //bet which we're referencing to
	
	public BetDialog(Controller ctrl, Racer rc)
	{
		super(ctrl, DF_DEFAULTBG|DF_DARKEN|DF_MODAL|DF_FREEZE, STR_PLACE_BET, STR_OK+";"+STR_CANCEL);
		escapeCmd = CMD_CANCEL;
		
		targetBet = GameLogic.player.calcBet();

		Menu m;
		Style menuStyle = new Style(0.80, 0.12, charset, Text.ALIGN_LEFT, Osd.RRT_TEST);
		
		spacing = sld_k.rt.height; //height of slider's holder rectangle, we use it as a vertical spacing metric unit
		
		float xpos = -0.40;
		float ypos = -spacing/2;
		
		m = osd.createMenu(menuStyle, xpos+0.1, ypos-0.035, 0);
		m.setSliderStyle(sld_h, sld_k);

		int minBet = calcMinBet();

		sld = m.addItem(STR_BET, CMD_SLIDER, bet, minBet, targetBet, Racer.BET_STEPS, null);

		sld.setValue(bet);
		sld.changeVLabelText("R$"+bet);

		osd.globalHandler = this;
		osdCommand(CMD_SLIDER);
	}

	public int calcBet(Racer rc)
	{
		return (int)((((rc.prestige/3*0.3)*(rc.getCarPrestige()/0.3*3))+1000)*rc.club);
	}

	public int calcMinBet() {
		int club = (GameLogic.player.club+1);
		float percentageMoney = GameLogic.player.money * 0.01;
		float minBet = (Racer.MIN_BET*club+percentageMoney);

		if (minBet > targetBet) {
			minBet = Racer.MIN_BET*club;
		}

		return (int)minBet;
	}

	public int calcPinks()
	{
		return Racer.MIN_BET*Racer.BET_STEPS*(GameLogic.player.club+1);
	}
	
	public void osdCommand(int cmd)
	{
		switch(cmd)
		{
			case(CMD_OK): //OK button
				result = bet;
				GameLogic.player.bet = bet;
				notify();
				break;
				
			case(CMD_CANCEL):
				result = 0;
				notify();
				break;
				
			case(CMD_SLIDER):
				int value = (int)sld.value;
				String str = "";
				
				if(value == Racer.BET_PINKS)
				{
					str = STR_PINKS;
					bet = Racer.BET_PINKS;
				} else {
					str = "R$" + value;
					bet = value;
				}
				
				sld.changeVLabelText(str);
				break;
		}
	}
}