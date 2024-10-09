package java.game.parts.engines.EA827_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;

public class crankshaft_80er extends Crankshaft
{
	public crankshaft_80er( int id )
	{
		super( id );
		name = "Virabrequim Volkswagen AP Bielinha 1.5 / 1.6";
		description = "80mm De Curso.";

		value = 350;
		brand_new_prestige_value = 84.30;
		setMaxWear(kmToMaxWear(526000.0));

		con_rod_slot_ID = 9;
		flywheel_slot_ID = 37;

		stroke = 80.0;
		main_bearing_diam = 0.0;
		con_bearing_diam = 0.0;

		maxRPM = 6100.0;
		inertia = kgToInertia(10*0.086);

		check4warnings();
	}
}
