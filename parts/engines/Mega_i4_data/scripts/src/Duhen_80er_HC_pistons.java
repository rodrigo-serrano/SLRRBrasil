package java.game.parts.engines.Mega_i4_data;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;

public class Duhen_80er_HC_pistons extends Piston
{
	public Duhen_80er_HC_pistons( int id )
	{
		super( id );
		name = "CHT 1.6 Pistons";

		description = "";

		value = tHUF2USD(4*5.5);
		brand_new_prestige_value = 27.94;
		setMaxWear(kmToMaxWear(305000.0));

		bore = 74.9;
		length_from_wrist_pin_center_to_crown_base = 50.00;
		crown_height = 0.00;
		crown_volume = -22.70;
		length_from_lowest_safe_belt_to_crown_base = 31.19;

		maxRPM = 9000;
		inertia = kgToInertia(4*0.150);
	}
}
