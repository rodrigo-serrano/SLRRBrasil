package java.game.parts.engines.CHE_C20XE;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class c20xe_pistons extends Piston
{
	public c20xe_pistons( int id )
	{
		super( id );
		name = "C20XE pistons";
		description = "";
		brand_new_prestige_value = 42.71;

		value = tHUF2USD(4*23);
		setMaxWear(kmToMaxWear(305000.0));

		bore = 80.8;
		length_from_wrist_pin_center_to_crown_base = 50.0;
		crown_height = 0.00;
		crown_volume = -20.70;
		length_from_lowest_safe_belt_to_crown_base = 31.19;

		maxRPM = 10000.0;
		inertia = kgToInertia(4*0.320);
	}
}