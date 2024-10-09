package java.game.parts.engines.SeriesKhonda;

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
		name = "Pistoes Originais Honda Serie K";
		description = "";

		value = 280;
		brand_new_prestige_value = 76.64;
		setMaxWear(kmToMaxWear(218000.0));

		bore = 85.99;
		length_from_wrist_pin_center_to_crown_base = 30.00;
		crown_height = 0.00;
		crown_volume = 4.25;
		length_from_lowest_safe_belt_to_crown_base = 20.00;

		maxRPM = 12000.0;
		inertia = kgToInertia(0.31*6);

		check4warnings();
	}
}
