package java.game.parts.engines.Mega_i4_data;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;


public class turbocharger_twin extends TurboCharger
{
	public turbocharger_twin( int id )
	{
		super( id );
		name = "Apexi i4 twin turbo turbocharger";
		description = "";
		brand_new_prestige_value = 109.30;

		value = tHUF2USD(635.000);

		calculateOptandRange (1500.0, 8750.0);
		P_turbo_max	= 2.0;
		default_P_turbo_waste	= 1.25;
		P_turbo_waste	= default_P_turbo_waste;

		max_waste	= 2.0;
		min_waste	= 0.6;
	}

        public void updatevariables()
	{
		setMaxWear(kmToMaxWear(120000.0));
	}

     	
}
