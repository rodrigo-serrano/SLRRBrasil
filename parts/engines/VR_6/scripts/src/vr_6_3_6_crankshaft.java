package java.game.parts.engines.VR_6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class vr_6_3_6_crankshaft extends Crankshaft
{
	public vr_6_3_6_crankshaft( int id )
	{
		super( id );
		name = "Virabrequim VW VR6 3.6";
		description = " ";

		brand_new_prestige_value = 28.81;
		value = tHUF2USD(133.515);
		setMaxWear(kmToMaxWear(526000.0));

		con_rod_slot_ID = 9;
		flywheel_slot_ID = 37;

		stroke = 83.8;
		main_bearing_diam = 0.0;
		con_bearing_diam = 0.0;

		maxRPM = 15000.0;
		inertia = kgToInertia(10.000);

		check4warnings();
	}

	public String isDynoable()
	{
		Part p;

		p = partOnSlot( 38 );
		if (!p)
			return "O Virabrequim esta sem Engrenagem.";

		return super.isDynoable();
	}
}