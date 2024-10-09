package java.game.parts.engines.VR_6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;

public class vr_6_2_8_HC_pistons extends Piston
{
	public vr_6_2_8_HC_pistons( int id )
	{
		super( id );
		name = "Pistoes VW VR6 2.8";
		description = "";

		value = tHUF2USD(6*14);
		brand_new_prestige_value = 44.71;
		setMaxWear(kmToMaxWear(205000.0));

		bore = 80.0;
		length_from_wrist_pin_center_to_crown_base = 32.31;
		crown_height = 17.07;
		crown_volume = 44.91;
		length_from_lowest_safe_belt_to_crown_base = 20.77;

		maxRPM = 11000.0;
		inertia = kgToInertia(6*0.390);

		check4warnings();
	}
}
