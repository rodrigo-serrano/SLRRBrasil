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
import java.game.parts.enginepart.block.*;
import java.game.parts.enginepart.slidingenginepart.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.camshaft.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.charger.*;

public class TurboGaugeAnalog extends DecorativeBodyPart
{
	// Working Analog Speedometer Script by RedCarDriver edited to Tachometer by Gorgoil
	
	// begin movable tachometer script
	
	int tacho_check_overflow	= 0;
	int tacho_check_underflow	= 1;
	
	int tacho_num_regions = 1; // will be equal to last array's index; number of rpmometer "chunks"
	float[] tacho_value	= new float[5];
	float[] tacho_pos	= new float[5];
	
	Thread AnimateThread;
	int installed;
	
	static float kmh_to_mph = 0.621371;
	static float deg_to_rad = 3.1415926 / 180;

	float pressure, throttle;

	public TurboGaugeAnalog( int id )
	{
		super( id );
		
		tacho_num_regions = 2;
		tacho_value[0]	= -1.0;
		tacho_pos[0]	= 0.0;
		tacho_value[1]	= 0.0;
		tacho_pos[1]	= 90.0;
		tacho_value[2]	= 4.0;
		tacho_pos[2]	= 270.0;
		
		AnimateThread = new Thread( this, "Animate Thread" );
		//animate_last_time = System.simTime();
		AnimateThread.start();
	}
	
	public void resetAnim() // forces animation to reset
	{
		if( partOnSlot(2) )
			partOnSlot(2).setSlotPos( 1, new Vector3(0,0,0), new Ypr(0,0,0) );
	}
	
	public void setGaugeNeedlePos( float deg )
	{
		if( partOnSlot(2) )
			partOnSlot(2).setSlotPos( 1, new Vector3(0,0,0), new Ypr(0,0,deg2rad(deg)) );
	}
	
	public float rad2deg( float rad )
	{
		return(rad / deg_to_rad);
	}
	public float deg2rad( float deg )
	{
		return(deg * deg_to_rad);
	}
	
	
	public float calcPointSlope( float x, float x1, float y1, float x2, float y2 )
	{
		return (y1 + (x-x1)*((y2-y1)/(x2-x1)));
	}
	
	public float position_interp( float rpm )
	{
		float deg;
		if( tacho_pos.length != tacho_value.length )
			return 0;
		int max = tacho_num_regions;
		
		// Anti-Overrun Checks
		if( tacho_check_overflow && rpm > tacho_value[max] )
			rpm = tacho_value[max];
		else if ( tacho_check_underflow && rpm < tacho_value[0] )
			rpm = tacho_value[0];
		
		int region = -1;
		int test_looper = 0;
		if( rpm < tacho_value[0] )
			region = 0;
		while( region == -1 )
		{
			if( rpm >= tacho_value[test_looper] && rpm <= tacho_value[test_looper+1] )
				region = test_looper;
			if( test_looper == max-1 )
				region = max-1;
			test_looper++;
		}
			
		deg = calcPointSlope( rpm, tacho_value[region], tacho_pos[region], tacho_value[region+1], tacho_pos[region+1] );
		
		return deg;
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
					installed = 1;

					throttle = GameLogic.player.car.chassis.getIndexedData(Chassis.IndexedData_ThrottleStrength);

					if(throttle > 0.1)
					{
						pressure = GameLogic.player.car.chassis.getCurrentTurboPressure();
					}
					else
					if(throttle < 0.1)
					{
						pressure = GameLogic.player.car.chassis.getCurrentTurboPressure2();
					}

					setGaugeNeedlePos(position_interp(pressure));
					if(AnimateThread) AnimateThread.sleep(5); // Wait 0.005 sec (in theory, assuming 29 FPS)
				}
				else
				{
					if( installed )
					{
						setGaugeNeedlePos(0);
						installed = 0;
					}

					if(AnimateThread) AnimateThread.sleep( 2000 ); // Wait 2 sec
				}
			}
		}
	}
}
