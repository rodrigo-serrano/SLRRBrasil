package java.game.parts.engines.Ford_302;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;
import java.game.cars.*;

public class supercharles extends SuperCharger
{
	public supercharles( int id )
	{
		super( id );
		name = "Supercharger Weiand 6-71 Motor Ford 302";
		description = "";
		
		value = 30000;
		brand_new_prestige_value = 49.80;

		pulley_diameter = 60.0; // in milimeters //
		pulley_width	= 60.0; // in milimeters //

		calculateOptandRange (000.0, 6000.0);
		default_rpm_turbo_mul = 3.5;
		P_turbo_max	= 3.5;
		P_turbo_waste	= 3.5;
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
			return "O Supercharger esta sem Correia.";

		return super.isDynoable();
	}
}
