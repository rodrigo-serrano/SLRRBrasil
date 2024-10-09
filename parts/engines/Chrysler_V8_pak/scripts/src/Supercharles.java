package java.game.parts.engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;
import java.game.cars.*;

public class Supercharles extends SuperCharger
{
	public Supercharles( int id )
	{
		super( id );
		name = "Supercharger Edelbrock Dodge 318";
		description = "";
		
		value = 8000;
		brand_new_prestige_value = 49.80;

		pulley_diameter = 60.0; // in milimeters //
		pulley_width	= 60.0; // in milimeters //

		calculateOptandRange (000.0, 9000.0);
		default_rpm_turbo_mul = 7.5;
		P_turbo_max	= 7.5;
		P_turbo_waste	= 7.5;
	}

	public void updatevariables()
	{
		rpm_turbo_mul = default_rpm_turbo_mul;
		setMaxWear(kmToMaxWear(205000.0));
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
