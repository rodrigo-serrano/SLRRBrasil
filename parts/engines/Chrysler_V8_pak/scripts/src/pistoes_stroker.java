package java.game.parts.engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;

public class pistoes_stroker extends Piston
{
	public pistoes_stroker( int id )
	{
		super( id );
		name = "Pistoes Forjados Kit Stroker Dodge 318";
		description = "";

		value = 2500;
		brand_new_prestige_value = 76.64;
		setMaxWear(kmToMaxWear(218000.0));

		bore = 99.1;
		length_from_wrist_pin_center_to_crown_base = 45.00;
		crown_height = 19.85;
		crown_volume = 70.56;
		length_from_lowest_safe_belt_to_crown_base = 24.14;

		maxRPM = 10000.0;
		inertia = kgToInertia(4*0.270);

		check4warnings();
	}
}
