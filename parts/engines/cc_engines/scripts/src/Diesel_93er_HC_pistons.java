package java.game.parts.engines.cc_engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class Diesel_93er_HC_pistons extends Piston
{
	public Diesel_93er_HC_pistons( int id )
	{
		super( id );
		name = "Cummins ISBe4 pistons";

		description = "";

		value = tHUF2USD(4*34);
		brand_new_prestige_value = 46.94;
		setMaxWear(kmToMaxWear(32000000.0));

		bore = 102.00;
		length_from_wrist_pin_center_to_crown_base = 50.00;
		crown_height = 0.00;
		crown_volume = -34.61;
		length_from_lowest_safe_belt_to_crown_base = 31.19;

		maxRPM = 9000;
		inertia = kgToInertia(4*0.310);
	}
}
