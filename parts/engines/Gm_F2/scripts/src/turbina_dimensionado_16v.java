package java.game.parts.engines.Gm_F2;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;


public class turbina_dimensionado_16v extends TurboCharger
{
	public turbina_dimensionado_16v( int id )
	{
		super( id );
		name = "Turbina Hx40 Para Gm 16v";
		description = "";
		brand_new_prestige_value = 200.00;

		value = 8500;

		calculateOptandRange (2800.0, 9000.0);
		P_turbo_max	= 2.10;
		default_P_turbo_waste	= 1.5;
		P_turbo_waste	= default_P_turbo_waste;

		max_waste	= 2.1;
		min_waste	= 0.8;
	}

        public void updatevariables()
	{
		setMaxWear(kmToMaxWear(120000.0));
	}



	
}
