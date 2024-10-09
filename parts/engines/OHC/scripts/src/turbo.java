package java.game.parts.engines.OHC;

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
		name = "Turbina .70 para OHC";
		description = "Made by Timek9";
		brand_new_prestige_value = 109.30;

		value = tHUF2USD(769.878);

		calculateOptandRange (1500.0, 7500.0);
		P_turbo_max	= 2.5;
		default_P_turbo_waste	= 1.5;
		P_turbo_waste	= default_P_turbo_waste;

		max_waste	= 2.6;
		min_waste	= 0.80;
	}



	
}
