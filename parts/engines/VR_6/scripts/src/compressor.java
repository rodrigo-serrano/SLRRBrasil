package java.game.parts.engines.VR_6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;
import java.game.cars.*;


public class compressor extends SuperCharger
{
	public compressor( int id )
	{
		super( id );
		name = "ASA Supercharger Stage 1";
		description = "";

		value = 5800;
		brand_new_prestige_value = 49.80;

		pulley_diameter = 50.0; // in milimeters //
		pulley_width	= 50.0; // in milimeters //

		calculateOptandRange (1500.0, 7000.0);
		default_rpm_turbo_mul = 1.0;
		P_turbo_max	= 1.8;
		P_turbo_waste	= 0.62;
	
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
