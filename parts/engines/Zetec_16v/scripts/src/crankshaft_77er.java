package java.game.parts.engines.Zetec_16v;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;

public class crankshaft_77er extends Crankshaft
{
	public crankshaft_77er( int id )
	{
		super( id );
		name = "Virabrequim motor Zetec 1.8 16v";
		description = "";

		value = 550;
		brand_new_prestige_value = 84.30;
		setMaxWear(kmToMaxWear(526000.0));

		con_rod_slot_ID = 9;
		flywheel_slot_ID = 37;

		stroke = 80.0;
		main_bearing_diam = 0.0;
		con_bearing_diam = 0.0;

		maxRPM = 9000.0;
		inertia = kgToInertia(2.00);

		check4warnings();
	}
}
