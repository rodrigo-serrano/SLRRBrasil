package java.game.parts.engines.CHT_Pack_Engine;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;

public class pistons_10 extends Piston
{
	public pistons_10( int id )
	{
		super( id );
		name = "Pistoes motor CHT 1.0";
		description = "";

		value = tHUF2USD(17.963);
		brand_new_prestige_value = 76.64;
		setMaxWear(kmToMaxWear(218000.0));

		bore = 70.1;
		length_from_wrist_pin_center_to_crown_base = 37.56;
		crown_height = 19.85;
		crown_volume = 70.56;
		length_from_lowest_safe_belt_to_crown_base = 24.14;

		maxRPM = 10000.0;
		inertia = kgToInertia(0.47);

		check4warnings();
	}
}
