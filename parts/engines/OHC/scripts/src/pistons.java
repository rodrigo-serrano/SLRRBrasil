package java.game.parts.engines.OHC;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;

public class pistons extends Piston
{
	public pistons( int id )
	{
		super( id );
		name = "OHC pistons";
		description = "";

		value = tHUF2USD(70.963);
		brand_new_prestige_value = 76.64;
		setMaxWear(kmToMaxWear(218000.0));

		bore = 82.5;
		length_from_wrist_pin_center_to_crown_base = 37.56;
		crown_height = 19.85;
		crown_volume = 70.56;
		length_from_lowest_safe_belt_to_crown_base = 24.14;

		maxRPM = 10000.0;
		inertia = kgToInertia(4*0.180);

		check4warnings();
	}
}
