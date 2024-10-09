package java.game.parts.engines.DevilsV6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class virabrequim_hyundai_3800 extends Crankshaft
{
	public virabrequim_hyundai_3800( int id )
	{
		super( id );
		name = "Virabrequim Motor V6 Hyundai 3.8";
		description = "";
		brand_new_prestige_value = 51.61;

		value = 800;
		setMaxWear(kmToMaxWear(526000.0));

		con_rod_slot_ID = 40;
		flywheel_slot_ID = 6;

		maxRPM = 15000.0;

		stroke = 87.00;
		main_bearing_diam = 45.05;
		con_bearing_diam = 45.05;

		inertia = kgToInertia(18.0);

		check4warnings();
	}

	public String isDynoable()
	{
		Part p;

		p = partOnSlot( 11 );
		if (!p)
			return "O Motor esta sem Correia Dentada";

		p = partOnSlot( 3 );
		if (!p)
			return "O Alternador esta sem Correia.";

		return super.isDynoable();
	}
}
