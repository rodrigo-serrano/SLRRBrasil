package java.game.parts.engines.DevilsV6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class DevilsV6_flywheel extends Flywheel
{
	public DevilsV6_flywheel( int id )
	{
		super( id );
		name = "Volante Universal Motor V6";
		description = "";
		brand_new_prestige_value = 57.34;

		value = 200;
		setMaxWear(kmToMaxWear(760000.0));

		maxRPM = 20000.0;

		clutch_slot_ID = 4;

		inertia = kgToInertia(13.0);

		check4warnings();
	}
}
