package java.game.parts.engines.cc_engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class Diesel_75er_crankshaft extends Crankshaft
{
	public Diesel_75er_crankshaft( int id )
	{
		super( id );
		name = "Cummins ISBe4 Turbo Crankshaft";
		description = "";

		value = tHUF2USD(98);
		brand_new_prestige_value = 45.12;
		setMaxWear(kmToMaxWear(30000000.0));

		con_rod_slot_ID =42;
		flywheel_slot_ID = 2;

		stroke = 120.0;
		main_bearing_diam = 0.0;
		con_bearing_diam = 0.0;

		maxRPM = 6100.0;
		inertia = kgToInertia(2.000);
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
