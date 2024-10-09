package java.game.parts.engines.SeriesKhonda;

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
		name = "Volante De Motor Honda Serie K";
		description = "";

		value = 272.72;
		brand_new_prestige_value = 25;
		setMaxWear(kmToMaxWear(760000.0));

		outer_radius = 360.0;

		clutch_slot_ID = 36;

		maxRPM = 12000.0;
		inertia = kgToInertia(16);

		check4warnings();
	}
}