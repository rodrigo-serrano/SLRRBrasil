package java.game.parts.engines.DevilsV6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;


public class DevilsV6_R_up_turbocharger extends TurboCharger
{
	public DevilsV6_R_up_turbocharger( int id )
	{
		super( id );
		name = "Turbina Alta Direita Motor V6";
		description = "";
		brand_new_prestige_value = 109.30;

		value = 3500;

		calculateOptandRange (3250.0, 7250.0);
		P_turbo_max	= 3.01;
		default_P_turbo_waste	= 1.25;
		P_turbo_waste	= default_P_turbo_waste;

		max_waste	= 2.5;
		min_waste	= 0.25;
	}

	public void updatevariables()
	{
		setMaxWear(kmToMaxWear(240000.0));
	}
}
