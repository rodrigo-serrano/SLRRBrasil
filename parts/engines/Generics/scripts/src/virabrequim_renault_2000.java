package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;

public class virabrequim_renault_2000 extends Crankshaft
{
	public virabrequim_renault_2000( int id )
	{
		super( id );
		name = "Virabrequim Renault 2.0 F4R";
		description = "";

		value = 850;
		brand_new_prestige_value = 84.30;
		setMaxWear(kmToMaxWear(526000.0));

		con_rod_slot_ID = 9;
		flywheel_slot_ID = 37;

		stroke = 93.0;
		main_bearing_diam = 0.0;
		con_bearing_diam = 0.0;

		maxRPM = 10000.0;
		inertia = kgToInertia(5*5.300);

		check4warnings();
	}
}
