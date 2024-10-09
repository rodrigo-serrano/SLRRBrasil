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

public class Tachometer_Shift_Light3 extends DecorativeBodyPart
{
	Thread AnimateThread;
	
	public Tachometer_Shift_Light3( int id )
	{
		super( id );
		name = "Cronomac Shift Light (green)";
		description = "Glow color: Green";
		catalog_view_ypr = new Ypr( 0.000, -0.750, 0.000 );

		
		value = tHUF2USD(1.0);
		brand_new_prestige_value = 1.0;

		AnimateThread = new Thread( this, "Animate Thread" );
		AnimateThread.start();

       		addPart( parts.Tachometer_pack:0x0000003Er, "pin" );
		disableSlot(2,1); // tacho needle
		
	}
		
	public void LightFlasher()
	{
		setSlotPos( 2, new Vector3(0,0,0), new Ypr(0,0,0));
		Thread.sleep(50);
		setSlotPos( 2, new Vector3(0.044, -0.024, -0.025), new Ypr(0,0,0) );
		Thread.sleep(50);
	}
	public void Light()
	{
		setSlotPos( 2, new Vector3(0,0,0), new Ypr(0,0,0));
	}
	public void LightUp()
	{
		float currentrpm = GameLogic.player.car.chassis.getIndexedData(Chassis.IndexedData_RPM);
		float limiter = (GameLogic.player.car.chassis.RPM_limit);
		float redlight = (limiter-650.0);
		float flashlimit = (limiter-150.0);

		if( currentrpm >= redlight && currentrpm < flashlimit )
		{
			Light();
		}
		else
		if(currentrpm>=flashlimit)
		{
			LightFlasher();
		}
		else
		if( currentrpm < redlight)
		{
		setSlotPos( 2, new Vector3(0.044, -0.024, -0.025), new Ypr(0,0,0) );
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
					float throttle = GameLogic.player.car.chassis.getIndexedData(Chassis.IndexedData_ThrottleStrength);	
					
					if (throttle>0.1)
						LightUp(); 
				}
			}
			AnimateThread.sleep(300); // Wait 0.050 sec
		}
	}
}