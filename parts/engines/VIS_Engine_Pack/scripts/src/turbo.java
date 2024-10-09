package java.game.parts.engines.VIS_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;


public class turbo extends TurboCharger
{
	public turbor( int id )
	{
		super( id );
		name = "Turbina HKS SPL";
		description = "Stock turbocharger for Fiat V.I.S. 20v turbo versions";
		brand_new_prestige_value = 109.30;

		value = 1500;

		calculateOptandRange (3000.0, 9500.0);
		P_turbo_max	= 2.50;
		default_P_turbo_waste	= 0.3;
		P_turbo_waste	= default_P_turbo_waste;

		max_waste	= 2.5;
		min_waste	= 0.25;
	}

        public void updatevariables()
	{
		setMaxWear(kmToMaxWear(120000.0));
	}
}