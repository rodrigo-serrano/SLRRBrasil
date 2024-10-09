package java.game.parts.engines.EA_211;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;

public class virabrequim_1000 extends Crankshaft
{
	public virabrequim_1000( int id )
	{
		super( id );
		name = "Virabrequim EA-211 3 Cilindros";
		description = "";

		value = 670;
		brand_new_prestige_value = 81.40;
		setMaxWear(kmToMaxWear(526000.0));

		con_rod_slot_ID = 9;
		flywheel_slot_ID = 37;

		stroke = 76.4;
		main_bearing_diam = 0.0;
		con_bearing_diam = 0.0;

		maxRPM = 9000.0;
		inertia = kgToInertia(12.300);

		check4warnings();
	}
}
