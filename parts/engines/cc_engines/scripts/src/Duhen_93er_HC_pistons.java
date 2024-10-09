package java.game.parts.engines.cc_engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class Duhen_93er_HC_pistons extends Piston
{
	public Duhen_93er_HC_pistons( int id )
	{
		super( id );
		name = "Zetec Rocam pistons";

		description = "";

		value = tHUF2USD(4*25);
		brand_new_prestige_value = 27.94;
		setMaxWear(kmToMaxWear(305000.0));

		bore = 67.9;
		length_from_wrist_pin_center_to_crown_base = 50.00;
		crown_height = 0.00;
		crown_volume = -34.61;
		length_from_lowest_safe_belt_to_crown_base = 31.19;

		maxRPM = 9000;
		inertia = kgToInertia(4*0.310);
	}
}
