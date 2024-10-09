package java.game.parts.engines.B18;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;


public class SL_Tuners_6_channel_NOS_rail extends TurboCharger
{
	public SL_Tuners_6_channel_NOS_rail( int id )
	{
		super( id );
		name = "Kit Nitro Honda Serie B";
		description = "";
		brand_new_prestige_value = 109.30;

		value = 4000;

		calculateOptandRange (3500.0, 9000.0);
		P_turbo_max	= 3.0;
		default_P_turbo_waste	= 2.65;
		P_turbo_waste	= default_P_turbo_waste;

		max_waste	= 3.0;
		min_waste	= 0.5;
	}

        public void updatevariables()
	{
		setMaxWear(kmToMaxWear(90000.0));
	}	
}