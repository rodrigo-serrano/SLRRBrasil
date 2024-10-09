package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;


public class turbina_tempra16v extends TurboCharger
{
	public turbina_tempra16v( int id )
	{
		super( id );
		name = "Turbina Holset Hx40 Para Tempra 16v";
		description = "";
		brand_new_prestige_value = 109.30;

		value = 3000;

		calculateOptandRange (3500.0, 8500.0);
		P_turbo_max	= 3.52;
		default_P_turbo_waste	= 1.5;
		P_turbo_waste	= default_P_turbo_waste;

		max_waste	= 2.5;
		min_waste	= 0.8;
	}

        public void updatevariables()
	{
		setMaxWear(kmToMaxWear(120000.0));
	}

		public void calculateOptandRange(float work_from, float work_to)
	{
		rpm_turbo_range = (work_to-work_from)*1.0;
		rpm_turbo_opt = work_from+rpm_turbo_range;
	}
}