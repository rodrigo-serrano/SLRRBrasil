package java.game.parts.engines.B18;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;

public class pistons_1 extends Piston
{
	public pistons_1( int id )
	{
		super( id );
		name = "Pistoes Alta Compressor Honda B16";
		description = "";

		value = 800;
		brand_new_prestige_value = 76.64;
		setMaxWear(kmToMaxWear(218000.0));

		bore = 81.00;
		length_from_wrist_pin_center_to_crown_base = 37.56;
		crown_height = 21.85;
		crown_volume = 90.56;
		length_from_lowest_safe_belt_to_crown_base = 44.14;

		maxRPM = 12000.0;
		inertia = kgToInertia(6*0.350);

		check4warnings();
	}
}
