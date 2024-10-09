package java.game.parts.engines.Mega_i4_data;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;


public class Ishima_WRZ_turbocharger extends TurboCharger
{
	public Ishima_WRZ_turbocharger( int id )
	{
		super( id );
		name = "GT2540R turbocharger";
		description = "This turbocharger is built into the Ishima Enula WRZ. \n It's designed to work from 2600 to 7800 RPM, but optimal pressure is from 3700 to 6500 RPM. It's a big help for the IshiBox powerplant. \n Charging stops at 0.5 bar (7.25 psi) thanks to the wastegate. The WG cannot be adjusted or bypassed on this model.";

		value = tHUF2USD(315);
		brand_new_prestige_value = 109.30;

		calculateOptandRange (1200.0, 7500.0);
		P_turbo_max	= 2.0;
		default_P_turbo_waste	= 0.8;
		P_turbo_waste	= default_P_turbo_waste;

		max_waste	= 1.80;
		min_waste	= 0.5;
	}

	public void updatevariables()
	{
		setMaxWear(kmToMaxWear(240000.0));
	}
}
