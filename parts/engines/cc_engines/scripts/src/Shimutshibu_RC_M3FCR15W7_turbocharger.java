package java.game.parts.engines.cc_engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;


public class Shimutshibu_RC_M3FCR15W7_turbocharger extends TurboCharger
{
	public Shimutshibu_RC_M3FCR15W7_turbocharger( int id )
	{
		super( id );
		name = "HKS GT2035 turbocharger";
		description = "";
		brand_new_prestige_value = 109.30;

		value = tHUF2USD(387);

		calculateOptandRange (1300.0, 9000.0);
		P_turbo_max	= 2.5;
		default_P_turbo_waste	= 2.0;
		P_turbo_waste	= default_P_turbo_waste;

		max_waste	= 2.0;
		min_waste	= 0.5;
	}

	public void updatevariables()
	{
		setMaxWear(kmToMaxWear(240000.0));
	}
}
