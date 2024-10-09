package java.game.parts.engines.Ford_302;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;

public class virabrequim_std extends Crankshaft
{
	public virabrequim_std( int id )
	{
		super( id );
		name = "Virabrequim Ford 302 STD";
		description = "";

		value = 7500;
		brand_new_prestige_value = 81.40;
		setMaxWear(kmToMaxWear(526000.0));

		con_rod_slot_ID = 40;
		flywheel_slot_ID = 6;

		stroke = 76.2;
		main_bearing_diam = 64.77;
		con_bearing_diam = 53.26;

		maxRPM = 9000.0;
		inertia = kgToInertia(12.300);

		check4warnings();
	}
}
