package java.game.parts.engines.CHE_C20XE;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class c20xe_flywheel extends Flywheel
{
	public c20xe_flywheel( int id )
	{
		super( id );
		name = "C20XE flywheel";
		description = "";

		value = tHUF2USD(41);
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(320000.0));

		outer_radius = 360.0;
		
		clutch_slot_ID = 37;

		maxRPM = 12000.0;
		inertia = kgToInertia(11.0);

		check4warnings();
	}
}