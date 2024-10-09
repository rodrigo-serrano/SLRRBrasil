package java.game.parts;

import java.io.*;
import java.util.*;
import java.util.resource.*;
import java.render.osd.*;
import java.game.*;
import java.game.cars.*;
import java.game.parts.*;
import java.game.parts.bodypart.*;
import java.game.parts.enginepart.*;
import java.game.parts.rgearpart.*;
import java.game.parts.rgearpart.reciprocatingrgearpart.*;

public class GPI_0 extends DecorativeBodyPart
{
	Thread AnimateThread;
	
	public GPI_0( int id )
	{
		super( id );
		name = "Digital Gear Indicator";
		description = "";
		catalog_view_ypr = new Ypr( 0.000, -0.750, 0.000 );

		
		value = tHUF2USD(1.0);
		brand_new_prestige_value = 1.0;

		AnimateThread = new Thread( this, "Animate Thread" );
		AnimateThread.start();
		
	}
	public int GetGear()
	{
		int gear;
		
		gear = RawEdit.getI(GameLogic.player.car.chassis.getIndexedAddr(Chassis.IndexedData_GearNumber));
		
		return gear;	
	}

	public float CurrentRPM()
	{
		float currentrpm = GameLogic.player.car.chassis.getIndexedData(Chassis.IndexedData_RPM);
		
		return currentrpm;
	}
	public void SetGear()
	{
		float currentrpm = CurrentRPM();
		int cur_gear = GetGear(); 
		
		if(currentrpm >= 500)
		{
			if(cur_gear == 1) 
			{
				setRenderType( parts.Universal_Gear_Indicator:0x00000016r ); //first
			}
			else
			if(cur_gear == 2) 
			{
				setRenderType( parts.Universal_Gear_Indicator:0x00000017r ); //second
			}
			else
			if(cur_gear == 3) 
			{
				setRenderType( parts.Universal_Gear_Indicator:0x00000018r ); //third
			}
			else
			if(cur_gear == 4) 
			{
				setRenderType( parts.Universal_Gear_Indicator:0x00000019r ); //fourth
			}
			else
			if(cur_gear == 5) 
			{
				setRenderType( parts.Universal_Gear_Indicator:0x0000001Ar ); //fifth
			}
			else
			if(cur_gear == 6) 
			{
				setRenderType( parts.Universal_Gear_Indicator:0x0000001Br ); //sixth
			}
			else
			if(cur_gear == 0) 
			{
				setRenderType( parts.Universal_Gear_Indicator:0x0000001Cr ); //neutral
			}
			else
			if(cur_gear == 7) 
			{
				setRenderType( parts.Universal_Gear_Indicator:0x0000001Dr ); //reverse
			}
		}
		else
		{
			setRenderType( parts.Universal_Gear_Indicator:0x00000015r ); //off
		}

	}	

	public void run()
	{
		while(1)
		{
			if(AnimateThread)
			{
				the_car = null;
				getCar_LocalVersion();
				
				if( the_car && GameLogic.player && GameLogic.player.car && the_car == GameLogic.player.car.chassis ) // player is using this car
				{			
						SetGear(); 
				}
			}
			AnimateThread.sleep(300); // Wait 0.050 sec
		}
	}
}