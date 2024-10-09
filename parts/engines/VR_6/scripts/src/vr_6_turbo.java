package java.game.parts.engines.VR_6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;

public class vr_6_turbo extends TurboCharger
{
	public vr_6_turbo( int id )
	{
		super( id );
		name = "Turbina VW VR6";
		description = "";

		value = 2000;
		brand_new_prestige_value = 71.50;

		calculateOptandRange (4000.0, 9000.0);
		P_turbo_max	= 2.0;
		default_P_turbo_waste	= 0.5;
		P_turbo_waste	= default_P_turbo_waste;

		max_waste	= 1.0;
		min_waste	= 0.25;
	}

	public void updatevariables()
	{
		setMaxWear(kmToMaxWear(100000.0));
	}
}