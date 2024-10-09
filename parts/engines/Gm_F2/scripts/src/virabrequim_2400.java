package java.game.parts.engines.Gm_F2;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;

public class virabrequim_2400 extends Crankshaft
{
	public virabrequim_2400( int id )
	{
		super( id );
		name = "Virabrequim GM F2 2.4";
		description = "";

		value = 1800;
		brand_new_prestige_value = 100.00;
		setMaxWear(kmToMaxWear(526000.0));

		con_rod_slot_ID = 9;
		flywheel_slot_ID = 37;

		stroke = 100.5;
		main_bearing_diam = 0.0;
		con_bearing_diam = 0.0;

		maxRPM = 10000.0;
		inertia = kgToInertia(5*5.300);

		check4warnings();
	}
}
