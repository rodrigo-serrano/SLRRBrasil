package java.game.parts.engines.DevilsV6;

import java.io.*;
import java.util.*;
import java.util.resource.*;
import java.render.osd.*;
import java.game.*;
import java.game.cars.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class ExhaustHeader_DevilsV6 extends ExhaustHeader
{
	public ExhaustHeader_DevilsV6( int id )
	{
		super( id );
		name = "Devil's V6 exhaust header";
		description = "";

		check4warnings();
	}
	
	int old_soundType;
	
	public int isTuneable()
	{
		return true;
	}
	
	public void buildTuningMenu( Menu m )
	{
		Part eb = the_car.partOnSlot(401);
		if (eb && eb instanceof Block_DevilsV6)
		{
			old_soundType = eb.getSoundType();

			String[]	soundtypeText = new String[7];
			soundtypeText[0] = "Nissan 350Z";
			soundtypeText[1] = "Acura NSX";
			soundtypeText[2] = "Nissan GTR R35";
			soundtypeText[3] = "Shelby Terlingua Mustang";
			soundtypeText[4] = "Audi TT 3.2";
			soundtypeText[5] = "Ford Capri RS3100";
			soundtypeText[6] = "BMW Z4 M Coupe";
			
			m.addItem( "Sound Type: ", 1, eb.getSoundType(), soundtypeText, null );
			GameLogic.player.car.wakeUp();
		}
	}

	public void endTuningSession( int cancelled )
	{
		Part eb = the_car.partOnSlot(401);
		if (eb && eb instanceof Block_DevilsV6)
		{
			if( cancelled )
			{
				eb.setSoundType(old_soundType);
			}
			else
			{
				getCar_LocalVersion();
				if (the_car)
					the_car.forceUpdate();
			}
		}
	}

	public void handleMessage( Event m )
	{
		Part eb = the_car.partOnSlot(401);
		if (eb && eb instanceof Block_DevilsV6)
		{
			if( m.cmd == 0 )
			{
			}
			else
			if( m.cmd == 1 )
			{
				eb.setSoundType(((MultiChoice)m.gadget).value);
			}
		}
	}
	
	public float rad2deg( float rad )
	{
		return(rad * 180 / 3.141);
	}
	public float deg2rad( float deg )
	{
		return(deg * 3.141 / 180);
	}
}
