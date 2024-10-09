package java.game.parts.engines.Boxer4;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class SuperDuty_500_pistons extends Piston
{
	public SuperDuty_500_pistons( int id )
	{
		super( id );
		name = "Pistoes Subaru EJ20";
		description = "";
		brand_new_prestige_value = 71.68;

		value = 250;
		setMaxWear(kmToMaxWear(411000.0));

		maxRPM = 12000.0;

		bore = 95.5;
		length_from_wrist_pin_center_to_crown_base = 72.00;
		crown_height = 42.19;
		crown_volume = 88.00;
		length_from_lowest_safe_belt_to_crown_base = 47.00;

		inertia = kgToInertia(6*0.620);

		check4warnings();
	}
}
