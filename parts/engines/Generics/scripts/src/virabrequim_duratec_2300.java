package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;

public class virabrequim_duratec_2300 extends Crankshaft
{
	public virabrequim_duratec_2300( int id )
	{
		super( id );
		name = "Virabrequim Duratec 2.3 16v";
		description = "";

		value = 1500;
		brand_new_prestige_value = 84.30;
		setMaxWear(kmToMaxWear(526000.0));

		con_rod_slot_ID = 9;
		flywheel_slot_ID = 37;

		stroke = 94.0;
		main_bearing_diam = 0.0;
		con_bearing_diam = 0.0;

		maxRPM = 10000.0;
		inertia = kgToInertia(5*5.300);

		check4warnings();
	}
}
