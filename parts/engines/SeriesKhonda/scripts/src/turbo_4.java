package java.game.parts.engines.SeriesKhonda;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;


public class turbo_4 extends TurboCharger
{
	public turbo_4( int id )
	{
		super( id );
		name = "Turbina Precision Street Honda Serie K";
		description = "";
		brand_new_prestige_value = 109.30;

		value = 1800;

		calculateOptandRange (3500.0, 9000.0);
		P_turbo_max	= 2.00;
		default_P_turbo_waste	= 1.00;
		P_turbo_waste	= default_P_turbo_waste;

		max_waste	= 2.06;
		min_waste	= 0.80;
	}

        public void updatevariables()
	{
		setMaxWear(kmToMaxWear(90000.0));
	}	
}