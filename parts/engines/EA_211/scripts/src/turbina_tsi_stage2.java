package java.game.parts.engines.EA_211;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;


public class turbina_tsi_stage2 extends TurboCharger
{
	public turbina_tsi_stage2( int id )
	{
		super( id );
		name = "Turbina Stage 2 Up Tsi";
		description = "";
		brand_new_prestige_value = 109.30;

		value = 2500;

		calculateOptandRange (3000.0, 9000.0);
		P_turbo_max	= 3.00;
		default_P_turbo_waste	= 1.5;
		P_turbo_waste	= default_P_turbo_waste;

		max_waste	= 2.00;
		min_waste	= 0.50;
	}

        public void updatevariables()
	{
		setMaxWear(kmToMaxWear(120000.0));
	}



	
}
