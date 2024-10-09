package java.game.parts.engines.SeriesKhonda;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;

public class pistons_2 extends Piston
{
	public pistons_2( int id )
	{
		super( id );
		name = "Pistoes Forjados Honda Serie K";
		description = "";

		value = 1000;
		brand_new_prestige_value = 20;
		setMaxWear(kmToMaxWear(411000.0));

		bore = 87.00;
		length_from_wrist_pin_center_to_crown_base = 30.00;
		crown_height = 0.00;
		crown_volume = 0.00;
		length_from_lowest_safe_belt_to_crown_base = 20.00;

		maxRPM = 15000.0;
		inertia = kgToInertia(0.32*6);

		check4warnings();
	}
}
