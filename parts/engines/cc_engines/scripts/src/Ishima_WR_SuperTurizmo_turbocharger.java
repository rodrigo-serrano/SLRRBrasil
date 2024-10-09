package java.game.parts.engines.cc_engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;


public class Ishima_WR_SuperTurizmo_turbocharger extends TurboCharger
{
	public Ishima_WR_SuperTurizmo_turbocharger( int id )
	{
		super( id );
		name = "Eaton M34 turbocharger";
		description = "";

		value = tHUF2USD(460);
		brand_new_prestige_value = 109.30;

		calculateOptandRange (1500.0, 9800.0);
		P_turbo_max	= 3.00;
		default_P_turbo_waste	= 1.5;
		P_turbo_waste	= default_P_turbo_waste;

		max_waste	= 2.5;
		min_waste	= 0.75;
	}

	public void updatevariables()
	{
		setMaxWear(kmToMaxWear(160000.0));
	}
	
}
