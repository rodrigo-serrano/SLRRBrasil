package java.game.parts.engines.EA827_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class flywheel_2 extends Flywheel
{
	public flywheel_2( int id )
	{
		super( id );
		name = "Volante De Motor Volkswagen AP";
		description = "Stock flywheel for 1.8 and 2.0L models.";

		value = tHUF2USD(160.987);
		brand_new_prestige_value = 51.09;
		setMaxWear(kmToMaxWear(760000.0));

		clutch_slot_ID = 36;

		maxRPM = 7000.0;
		inertia = kgToInertia(10.0);

		check4warnings();
	}
}
