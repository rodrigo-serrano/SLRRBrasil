package java.game.parts.engines.VR_6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;

public class vr_6_2_8_crankshaft extends Crankshaft
{
	public vr_6_2_8_crankshaft( int id )
	{
		super( id );
		name = "Virabrequim VW VR6 2.8";
		description = " ";

		value = tHUF2USD(34);
		brand_new_prestige_value = 42.15;
		setMaxWear(kmToMaxWear(326000.0));

		con_rod_slot_ID = 9;
		flywheel_slot_ID = 37;

		stroke = 90.3;
		main_bearing_diam = 0.0;
		con_bearing_diam = 0.0;

		maxRPM = 9000.0;
		inertia = kgToInertia(11.500);

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
