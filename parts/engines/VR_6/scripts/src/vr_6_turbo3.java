package java.game.parts.engines.VR_6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;


public class vr_6_turbo3 extends TurboCharger
{
	public vr_6_turbo3( int id )
	{
		super( id );
		name = "Turbina 3 VW VR6";
		description = "";
		brand_new_prestige_value = 109.30;

		value = tHUF2USD(635.000);

		calculateOptandRange (1500.0, 8750.0);
		P_turbo_max	= 4.00;
		default_P_turbo_waste	= 1.25;
		P_turbo_waste	= default_P_turbo_waste;

		max_waste	= 2.0;
		min_waste	= 0.75;
	}

        public void updatevariables()
	{
		setMaxWear(kmToMaxWear(120000.0));
	}	
}