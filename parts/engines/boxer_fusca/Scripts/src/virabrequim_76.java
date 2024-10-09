package java.game.parts.engines.boxer_fusca;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class virabrequim_76 extends Crankshaft
{
	public virabrequim_76( int id )
	{
		super( id );
		name = "Virabrequim Fusca 76mm Curso";
		description = "Virabrequim Cursado Empi";
		brand_new_prestige_value = 20;

		value = 3000;
		setMaxWear(kmToMaxWear(526000.0));

		con_rod_slot_ID = 40;
		flywheel_slot_ID = 6;

		maxRPM = 10000.0;

		stroke = 76.00;
		main_bearing_diam = 45.05;
		con_bearing_diam = 45.05;

		inertia = kgToInertia(18.0);

		check4warnings();
	}
}