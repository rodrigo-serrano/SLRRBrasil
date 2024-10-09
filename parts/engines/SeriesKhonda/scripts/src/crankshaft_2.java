package java.game.parts.engines.SeriesKhonda;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;

public class crankshaft_2 extends Crankshaft
{
	public crankshaft_2( int id )
	{
		super( id );
		name = "Virabrequim Forjado Honda K24";
		description = "";

		value = 2000;
		brand_new_prestige_value = 42.30;
		setMaxWear(kmToMaxWear(326000.0));

		con_rod_slot_ID = 9;
		flywheel_slot_ID = 37;

		stroke = 99.002;
		main_bearing_diam = 0.0;
		con_bearing_diam = 0.0;

		maxRPM = 9000.0;
		inertia = kgToInertia(1.0);

		check4warnings();
	}
}