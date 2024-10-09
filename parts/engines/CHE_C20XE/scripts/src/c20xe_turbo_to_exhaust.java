package java.game.parts.engines.CHE_C20XE;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class c20xe_turbo_to_exhaust extends Part
{
	public c20xe_turbo_to_exhaust( int id )
	{
		super( id );
		name = "C20XE turbocharger to exhaust pipe";
		description = "";
		brand_new_prestige_value = 34.17;

		value = tHUF2USD(2*7);
		setMaxWear(kmToMaxWear(250000.0));
	}
}