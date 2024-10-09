package java.game.parts.engines.DevilsV6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;
import java.game.cars.*;

public class DevilsV6_Performance_supercharger extends SuperCharger
{
	public DevilsV6_Performance_supercharger( int id )
	{
		super( id );
		name = "Supercharger Para ITB Motor V6";
		description = "";
		brand_new_prestige_value = 85.05;

		value = 20000;

		pulley_diameter = 60.0; // in milimeters //
		pulley_width	= 60.0; // in milimeters //

		calculateOptandRange (700.0, 7000.0);
		default_rpm_turbo_mul = 2.0;
		P_turbo_max	= 3.50;
	}

	public void updatevariables()
	{
		rpm_turbo_mul = default_rpm_turbo_mul;
		setMaxWear(kmToMaxWear(15000.0));
	}
}
