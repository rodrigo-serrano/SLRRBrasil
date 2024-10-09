package java.game.parts.engines.B18;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class flywheel extends Flywheel
{
	public flywheel( int id )
	{
		super( id );
		name = "Volante Motor Honda Serie B";
		description = "";

		value = 200;
		brand_new_prestige_value = 51.09;
		setMaxWear(kmToMaxWear(760000.0));

		clutch_slot_ID = 36;

		maxRPM = 12000.0;
		inertia = kgToInertia(9.5);

		check4warnings();
	}
}