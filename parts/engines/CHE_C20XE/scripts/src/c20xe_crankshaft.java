package java.game.parts.engines.CHE_C20XE;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class c20xe_crankshaft extends Crankshaft
{
	public c20xe_crankshaft( int id )
	{
		super( id );
		name = "C20XE crankshaft";
		description = "";

		value = tHUF2USD(30);
		brand_new_prestige_value = 30.76;
		setMaxWear(kmToMaxWear(311000.0));

		con_rod_slot_ID = 42;
		flywheel_slot_ID = 2;

		stroke = 73.00001;
		main_bearing_diam = 0.0;
		con_bearing_diam = 0.0;

		maxRPM = 10000.0;
		inertia = kgToInertia(7.500);
	}

	public String isDynoable()
	{
		Part p;

		p = partOnSlot( 4 );
		if (!p)
			return "O Motor esta sem Correia Dentada.";

		return super.isDynoable();
	}
}