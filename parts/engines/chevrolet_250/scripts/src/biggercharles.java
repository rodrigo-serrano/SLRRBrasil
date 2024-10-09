package java.game.parts.engines.chevrolet_250;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;
import java.game.cars.*;

public class biggercharles extends SuperCharger
{
	public biggercharles( int id )
	{
		super( id );
		name = "Supercharger Weiand 8-71 Motor Chevrolet 250";
		description = "";
		
		value = 25500;
		brand_new_prestige_value = 88.80;

		pulley_diameter = 120.0; // in milimeters //
		pulley_width	= 120.0; // in milimeters //

		calculateOptandRange (200.0, 3500.0);
		default_rpm_turbo_mul = 2.4;
		P_turbo_max	= 2.4;
		P_turbo_waste	= 2.4;
	}

	public void updatevariables()
	{
		rpm_turbo_mul = default_rpm_turbo_mul;
		setMaxWear(kmToMaxWear(205000.0));
	}


	public String isDynoable()
	{
		Part p;

		p = partOnSlot( 16 );
		if (!p)
			return "the supercharger is missing the drive belt.";

		return super.isDynoable();
	}
}
