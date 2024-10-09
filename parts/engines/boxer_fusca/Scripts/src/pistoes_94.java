package java.game.parts.engines.boxer_fusca;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class pistoes_94 extends Piston
{
	public pistoes_94( int id )
	{
		super( id );
		name = "Pistoes Motor Fusca D:94mm A:20mm";
		description = "";
		brand_new_prestige_value = 20;

		value = 3500;
		setMaxWear(kmToMaxWear(411000.0));

		maxRPM = 9500.0;

		bore = 94.00;
		length_from_wrist_pin_center_to_crown_base = 20.00;// Piston Compression Height
		crown_height = 0.00;// - no effect on compression
		crown_volume = 0.00;// dome/dish on piston - will effect compression
		length_from_lowest_safe_belt_to_crown_base = 47.00;// No known effect of changing this - unable to locate accurate measurments for LS3

		inertia = kgToInertia(8*1.15);

		check4warnings();
	}
}