package java.game.parts.engines.CHE_C20XE;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;

public class c20xe_turbocharger extends TurboCharger
{
	public c20xe_turbocharger( int id )
	{
		super( id );
		name = "C20XE turbocharger";
		description = "";
		brand_new_prestige_value = 109.30;

		value = 1800;

		calculateOptandRange (3500.0, 11000.0);
		P_turbo_max	= 2.25;
		default_P_turbo_waste	= 1.0;
		P_turbo_waste	= default_P_turbo_waste;

		max_waste	= 2.5;
		min_waste	= 0.80;
	}

	public void updatevariables()
	{
		setMaxWear(kmToMaxWear(240000.0));
	}
	
		public String isDynoable()
	{
		Part p;

		p = partOnSlot( 18 );
		if (!p)
			return "The engine is missing the turbocharger to intake pipe.";
		
		p = partOnSlot( 21 );
		if (!p)
			return "The engine is missing the turbocharger to exhaust pipe.";

		return super.isDynoable();
	}
}