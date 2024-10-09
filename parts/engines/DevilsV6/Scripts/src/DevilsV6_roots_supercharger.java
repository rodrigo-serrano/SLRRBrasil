package java.game.parts.engines.DevilsV6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;
import java.game.cars.*;

public class DevilsV6_roots_supercharger extends SuperCharger
{
	public DevilsV6_roots_supercharger( int id )
	{
		super( id );
		name = "Supercharger Roots Motor V6";
		description = "";
		brand_new_prestige_value = 85.05;

		value = 7500;

		pulley_diameter = 60.0; // in milimeters //
		pulley_width	= 60.0; // in milimeters //

		calculateOptandRange (400.0, 4000.0);
		default_rpm_turbo_mul = 1.5;
		P_turbo_max	= 1.15;
	}

	public void updatevariables()
	{
		rpm_turbo_mul = default_rpm_turbo_mul;
		setMaxWear(kmToMaxWear(15000.0));
	}

	public String isDynoable()
	{
		Part p;
		
		p = partOnSlot( 15 );
		if (!p)
			return "O Supercharger esta sem Correia.";

		return super.isDynoable();
	}
}
