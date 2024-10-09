package java.game.parts.engines.VIS_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;

public class pistons_5cyl_82er extends Piston
{
	public pistons_5cyl_82er( int id )
	{
		super( id );
		name = "Pistoes Fiat V.I.S. 2.0 20v";
		description = "";

		value = 500;
		brand_new_prestige_value = 76.64;
		setMaxWear(kmToMaxWear(218000.0));

		bore = 81.98;
		length_from_wrist_pin_center_to_crown_base = 37.56;
		crown_height = 19.85;
		crown_volume = 70.56;
		length_from_lowest_safe_belt_to_crown_base = 24.14;

		maxRPM = 10000.0;
		inertia = kgToInertia(5*0.306);

		check4warnings();
	}
}
