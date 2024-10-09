package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;

public class pistoes_lada_1600_alcool extends Piston
{
	public pistoes_lada_1600_alcool( int id )
	{
		super( id );
		name = "Pistoes Lada 1.6 8v Alcool";
		description = "";

		value = 400;
		brand_new_prestige_value = 76.64;
		setMaxWear(kmToMaxWear(218000.0));

		bore = 79.00;
		length_from_wrist_pin_center_to_crown_base = 36.50;
		crown_height = 4.00;
		crown_volume = 10.00;
		length_from_lowest_safe_belt_to_crown_base = 24.14;

		maxRPM = 9000.0;
		inertia = kgToInertia(5*0.350);

		check4warnings();
	}
}
