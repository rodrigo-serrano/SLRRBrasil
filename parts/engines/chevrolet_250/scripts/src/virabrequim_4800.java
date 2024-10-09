package java.game.parts.engines.chevrolet_250;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;

public class virabrequim_4800 extends Crankshaft
{
	public virabrequim_4800( int id )
	{
		super( id );
		name = "Virabrequim 4.8 Canaviero Chevrolet 292";
		description = "";

		value = 3500;
		brand_new_prestige_value = 84.30;
		setMaxWear(kmToMaxWear(526000.0));

		con_rod_slot_ID = 9;
		flywheel_slot_ID = 37;

		stroke = 104.6;
		main_bearing_diam = 0.0;
		con_bearing_diam = 0.0;

		maxRPM = 7000.0;
		inertia = kgToInertia(5*5.300);

		check4warnings();
	}
}
