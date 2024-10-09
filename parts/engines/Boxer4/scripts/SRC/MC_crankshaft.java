package java.game.parts.engines.Boxer4;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class MC_crankshaft extends Crankshaft
{
	public MC_crankshaft( int id )
	{
		super( id );
		name = "Virabequim Subaru EJ25";
		description = "";
		brand_new_prestige_value = 51.61;

		value = 800;
		setMaxWear(kmToMaxWear(526000.0));

		con_rod_slot_ID = 40;
		flywheel_slot_ID = 6;

		maxRPM = 11500.0;

		stroke = 88.4;
		main_bearing_diam = 45.05;
		con_bearing_diam = 45.05;

		inertia = kgToInertia(11.0);

		check4warnings();
	}

	public String isDynoable()
	{
		Part p;

		p = partOnSlot( 11 );
		if (!p)
			return "O Motor esta sem Correia Dentada.";

		p = partOnSlot( 3 );
		if (!p)
			return "O Motor esta sem Correia de Acessorios.";

		return super.isDynoable();
	}
}
