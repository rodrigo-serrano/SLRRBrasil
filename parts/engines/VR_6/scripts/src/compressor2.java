package java.game.parts.engines.VR_6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;
import java.game.cars.*;


public class compressor2 extends SuperCharger
{
	public compressor2( int id )
	{
		super( id );
		name = "ASA Supercharger Stage 2";
		description = "";

		value = tHUF2USD(420);
		brand_new_prestige_value = 49.80;

		pulley_diameter = 50.0; // in milimeters //
		pulley_width	= 50.0; // in milimeters //

		calculateOptandRange (2500.0, 7000.0);
		default_rpm_turbo_mul = 1.0;
		P_turbo_max	= 2.6;
		P_turbo_waste	= 1.05;
	
	}

	public String isDynoable()
	{
		Part p;

		p = partOnSlot( 31 );
		if (!p)
			return "the compressor is missing the drive belt.";

		return super.isDynoable();
	}
}
