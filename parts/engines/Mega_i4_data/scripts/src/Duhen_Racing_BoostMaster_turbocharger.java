package java.game.parts.engines.Mega_i4_data;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;

public class Duhen_Racing_BoostMaster_turbocharger extends TurboCharger
{
	public Duhen_Racing_BoostMaster_turbocharger( int id )
	{
		super( id );
		name = "Greddy TD-05";
		description = "";

		value = tHUF2USD(355);
		brand_new_prestige_value = 71.50;

		calculateOptandRange (1000.0, 8000.0);
		P_turbo_max	= 3.5;
		default_P_turbo_waste	= 0.90;
		P_turbo_waste	= default_P_turbo_waste;

		max_waste	= 1.5;
		min_waste	= 0.25;
	}

	public void updatevariables()
	{
		setMaxWear(kmToMaxWear(100000.0));
	}
}
