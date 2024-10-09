package java.game.parts.engines.BF_161;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;

public class pistoes_3000 extends Piston
{
	public pistoes_3000( int id )
	{
		super( id );
		name = "Pistoes Willys 3000";
		description = "";

		value = 570;
		brand_new_prestige_value = 76.64;
		setMaxWear(kmToMaxWear(218000.0));

		bore = 79.4;
		length_from_wrist_pin_center_to_crown_base = 27.50;
		crown_height = 19.85;
		crown_volume = 70.56;
		length_from_lowest_safe_belt_to_crown_base = 24.14;

		maxRPM = 7000.0;
		inertia = kgToInertia(5*0.350);

		check4warnings();
	}
}