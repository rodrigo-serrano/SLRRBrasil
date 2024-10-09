package java.game.parts.engines.DevilsV6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class pistoes_honda_3500 extends Piston
{
	public pistoes_honda_3500( int id )
	{
		super( id );
		name = "Pistoes Motor V6 Honda 3.5 J35";
		description = "";
		brand_new_prestige_value = 71.68;

		value = 1000;
		setMaxWear(kmToMaxWear(411000.0));

		maxRPM = 10000.0;

		bore = 89.00;
		length_from_wrist_pin_center_to_crown_base = 62.00;
		crown_height = 22.00;
		crown_volume = 60.00;
		length_from_lowest_safe_belt_to_crown_base = 47.00;

		inertia = kgToInertia(6*0.620);

		check4warnings();
	}
}