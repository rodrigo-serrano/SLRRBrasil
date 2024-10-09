package java.game.parts.engines.VR_6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;


public class vr_6_turbo2 extends TurboCharger
{
	public vr_6_turbo2( int id )
	{
		super( id );
		name = "Turbina 2 VW VR6";
		description = "";

		value = tHUF2USD(315);
		brand_new_prestige_value = 109.30;

		calculateOptandRange (2600.0, 7800.0);
		P_turbo_max	= 1.15;
		default_P_turbo_waste	= 0.4;
		P_turbo_waste	= default_P_turbo_waste;

		max_waste	= 0.75;
		min_waste	= 0.25;
	}

	public void updatevariables()
	{
		setMaxWear(kmToMaxWear(240000.0));
	}
}