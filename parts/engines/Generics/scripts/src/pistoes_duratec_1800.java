package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;

public class pistoes_duratec_1800 extends Piston
{
	public pistoes_duratec_1800( int id )
	{
		super( id );
		name = "Pistoes Duratec 1.8 16v";
		description = "";

		value = 500;
		brand_new_prestige_value = 76.64;
		setMaxWear(kmToMaxWear(218000.0));

		bore = 83.00;
		length_from_wrist_pin_center_to_crown_base = 55.00;
		crown_height = 4.00;
		crown_volume = 10.00;
		length_from_lowest_safe_belt_to_crown_base = 24.14;

		maxRPM = 9000.0;
		inertia = kgToInertia(5*0.350);

		check4warnings();
	}
}
