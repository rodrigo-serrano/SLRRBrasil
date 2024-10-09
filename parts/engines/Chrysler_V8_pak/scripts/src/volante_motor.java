package java.game.parts.engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class volante_motor extends Flywheel
{
	public volante_motor( int id )
	{
		super( id );
		name = "Volante de motor Dodge 318";
		description = "";

		value = 200;
		brand_new_prestige_value = 51.09;
		setMaxWear(kmToMaxWear(760000.0));

		clutch_slot_ID = 4;

		maxRPM = 12000.0;
		inertia = kgToInertia(10.0);

		check4warnings();
	}
}
