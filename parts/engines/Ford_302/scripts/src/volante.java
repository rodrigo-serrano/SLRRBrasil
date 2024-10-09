package java.game.parts.engines.Ford_302;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class volante extends Flywheel
{
	public volante( int id )
	{
		super( id );
		name = "Volante de motor Ford 302";
		description = "";

		value = 250;
		brand_new_prestige_value = 51.09;
		setMaxWear(kmToMaxWear(760000.0));

		clutch_slot_ID = 4;

		maxRPM = 12000.0;
		inertia = kgToInertia(10.0);

		check4warnings();
	}
}
