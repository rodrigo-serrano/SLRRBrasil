package java.game.parts.engines.VR_6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;

public class vr_6_2_9_pistons extends Piston
{
	public vr_6_2_9_pistons( int id )
	{
		super( id );
		name = "Pistoes VW VR6 2.9";
		description = "";


		value = tHUF2USD(6*23);
		brand_new_prestige_value = 76.64;
		setMaxWear(kmToMaxWear(218000.0));

		bore = 93.0;
		length_from_wrist_pin_center_to_crown_base = 37.56;
		crown_height = 19.85;
		crown_volume = 70.56;
		length_from_lowest_safe_belt_to_crown_base = 24.14;

		maxRPM = 10000.0;
		inertia = kgToInertia(6*0.450);

		check4warnings();
	}
}