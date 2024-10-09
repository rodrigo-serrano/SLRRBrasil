package java.game.parts.engines.cc_engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class Ishima_75er_crankshaft extends Crankshaft
{
	public Ishima_75er_crankshaft( int id )
	{
		super( id );
		name = "Fiat 1.0 Fiasa crankshaft";
		description = "A high-tech light - 7.5 kgs (16.5 pounds) - and very strong dinamically balanced 75.0 mm (2.95 inch) stroker crankshaft for the IshiBox 2.0 engines. \n This shaft withstands 10000 peak RPM!";

		value = tHUF2USD(38);
		brand_new_prestige_value = 30.76;
		setMaxWear(kmToMaxWear(311000.0));

		con_rod_slot_ID = 42;
		flywheel_slot_ID = 2;

		stroke = 64.9;
		main_bearing_diam = 0.0;
		con_bearing_diam = 0.0;

		maxRPM = 7000.0;
		inertia = kgToInertia(7.500);
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
