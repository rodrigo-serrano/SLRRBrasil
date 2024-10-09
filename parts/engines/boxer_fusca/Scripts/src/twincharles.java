package java.game.parts.engines.boxer_fusca;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;
import java.game.cars.*;

public class twincharles extends SuperCharger
{
	public twincharles( int id )
	{
		super( id );
		name = "Supercharger Twin Motor Fusca";
		description = "";
		
		value = 15000;
		brand_new_prestige_value = 49.80;

		pulley_diameter = 60.0; // in milimeters //
		pulley_width	= 60.0; // in milimeters //

		calculateOptandRange (0.0, 10000.0);
		default_rpm_turbo_mul = 10.5;
		P_turbo_max	= 10.53;
		P_turbo_waste	= 10.5;
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

		p = partOnSlot( 108 );
		if (!p)
			return "O Supercharger esta sem Suporte.";

		return super.isDynoable();
	}
}
