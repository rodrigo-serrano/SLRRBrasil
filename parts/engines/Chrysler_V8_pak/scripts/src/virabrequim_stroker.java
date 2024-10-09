package java.game.parts.engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;

public class virabrequim_stroker extends Crankshaft
{
	public virabrequim_stroker( int id )
	{
		super( id );
		name = "Virabrequim Stroker 4 Pol Dodge 318 V8";
		description = "";

		value = 670;
		brand_new_prestige_value = 81.40;
		setMaxWear(kmToMaxWear(526000.0));

		con_rod_slot_ID = 40;
		flywheel_slot_ID = 6;

		stroke = 101.6;
		main_bearing_diam = 0.0;
		con_bearing_diam = 0.0;

		maxRPM = 9000.0;
		inertia = kgToInertia(12.300);

		check4warnings();
	}
}
