package java.game.parts.engines.EA827_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;

public class pistons_MD280 extends Piston
{
	public pistons_MD280( int id )
	{
		super( id );
		name = "Pistoes Volkswagen AP 1.8 Bielinha MD-280 Gasolina";
		description = "Stock pistons for Volkswagen engines.";

		value = 300;
		brand_new_prestige_value = 76.64;
		setMaxWear(kmToMaxWear(218000.0));

		bore = 80.0;
		length_from_wrist_pin_center_to_crown_base = 38.25;
		crown_height = 19.85;
		crown_volume = 70.56;
		length_from_lowest_safe_belt_to_crown_base = 24.14;

		maxRPM = 10000.0;
		inertia = kgToInertia(4*0.275);

		check4warnings();
	}
}
