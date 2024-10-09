package java.game.parts.engines.EA827_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;


public class turbina_master_power extends TurboCharger
{
	public turbina_master_power( int id )
	{
		super( id );
		name = "Turbina Master Power 50/48";
		description = "";
		brand_new_prestige_value = 109.30;

		value = 1800;

		calculateOptandRange (3000.0, 9000.0);
		P_turbo_max	= 2.00;
		default_P_turbo_waste	= 1.0;
		P_turbo_waste	= default_P_turbo_waste;

		max_waste	= 2.00;
		min_waste	= 0.20;
	}

        public void updatevariables()
	{
		setMaxWear(kmToMaxWear(120000.0));
	}



	
}
