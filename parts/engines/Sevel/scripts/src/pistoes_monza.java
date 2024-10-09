package java.game.parts.engines.Sevel;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;

public class pistoes_monza extends Piston
{
	public pistoes_monza( int id )
	{
		super( id );
		name = "Pistoes Monza 2.0 Medida +1mm Adaptado Para Biela Sevel";
		description = "";

		value = 600;
		brand_new_prestige_value = 76.64;
		setMaxWear(kmToMaxWear(218000.0));

		bore = 86.98;
		length_from_wrist_pin_center_to_crown_base = 30.00;
		crown_height = 19.85;
		crown_volume = 70.56;
		length_from_lowest_safe_belt_to_crown_base = 24.14;

		maxRPM = 9000.0;
		inertia = kgToInertia(5*0.350);

		check4warnings();
	}
}