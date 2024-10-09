package java.game.parts.engines.cc_engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class Inline4_Flywheel extends Flywheel
{
	public Inline4_Flywheel( int id )
	{
		super( id );
		name = "Volante Motor 1.0";
		description = "";

		value = 40;
		brand_new_prestige_value = 51.09;
		setMaxWear(kmToMaxWear(760000.0));

		clutch_slot_ID = 36;

		maxRPM = 12000.0;
		inertia = kgToInertia(15.0);

		check4warnings();
	}
}
