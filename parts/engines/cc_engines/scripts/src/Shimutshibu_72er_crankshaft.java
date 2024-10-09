package java.game.parts.engines.cc_engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class Shimutshibu_72er_crankshaft extends Crankshaft
{
	public Shimutshibu_72er_crankshaft( int id )
	{
		super( id );
		name = "Powertech 1.0 crankshaft";
		description = "";

		value = tHUF2USD(30);
		brand_new_prestige_value = 30.76;
		setMaxWear(kmToMaxWear(311000.0));

		con_rod_slot_ID = 42;
		flywheel_slot_ID = 2;

		stroke = 62.9;
		main_bearing_diam = 0.0;
		con_bearing_diam = 0.0;

		maxRPM = 7600.0;
		inertia = kgToInertia(7.800);
	}

	public String isDynoable()
	{
		Part p;

		p = partOnSlot( 4 );
		if (!p)
			return "the engine is missing the camshaft drive belt.";

		return super.isDynoable();
	}
}
