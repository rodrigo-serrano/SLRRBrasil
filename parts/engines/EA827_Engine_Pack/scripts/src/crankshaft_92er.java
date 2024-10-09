package java.game.parts.engines.EA827_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;

public class crankshaft_92er extends Crankshaft
{
	public crankshaft_92er( int id )
	{
		super( id );
		name = "Virabrequim Volkswagen AP 2.0";
		description = "92.8mm De Curso.";

		value = tHUF2USD(88.469);
		brand_new_prestige_value = 84.30;
		setMaxWear(kmToMaxWear(526000.0));

		con_rod_slot_ID = 9;
		flywheel_slot_ID = 37;

		stroke = 92.8;
		main_bearing_diam = 0.0;
		con_bearing_diam = 0.0;

		maxRPM = 9000.0;
		inertia = kgToInertia(10*0.098);

		check4warnings();
	}
}
