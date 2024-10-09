package java.game.parts.engines.cc_engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;


public class turbocharger_6 extends TurboCharger
{
	public turbocharger_6( int id )
	{
		super( id );
		name = "Apexi F2U";
		description = "";
		brand_new_prestige_value = 109.30;

		value = tHUF2USD(635.000);

		calculateOptandRange (1500.0, 8750.0);
		P_turbo_max	= 2.19;
		default_P_turbo_waste	= 1.25;
		P_turbo_waste	= default_P_turbo_waste;

		max_waste	= 2.2;
		min_waste	= 0.50;
	}

        public void updatevariables()
	{
		setMaxWear(kmToMaxWear(120000.0));
	}
}