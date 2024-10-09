package java.game.parts.engines.boxer_fusca;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class virabrequim_88 extends Crankshaft
{
	public virabrequim_88( int id )
	{
		super( id );
		name = "Virabrequim Fusca 88mm Curso";
		description = "Virabrequim Cursado Empi";
		brand_new_prestige_value = 20;

		value = 6000;
		setMaxWear(kmToMaxWear(526000.0));

		con_rod_slot_ID = 40;
		flywheel_slot_ID = 6;

		maxRPM = 12000.0;

		stroke = 88.00;
		main_bearing_diam = 64.77;
		con_bearing_diam = 53.26;

		inertia = kgToInertia(14.0);

		check4warnings();
	}
}