package java.game.parts.engines.EA827_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;

public class pistons_BR extends Piston
{
	public pistons_BR( int id )
	{
		super( id );
		name = name = "Pistoes Volkswagen AP 1.5 BR Bielinha Gasolina";
		description = "Stock pistons for Volkswagen engines.";

		value = 150;
		brand_new_prestige_value = 76.64;
		setMaxWear(kmToMaxWear(218000.0));

		bore = 75.0;
		length_from_wrist_pin_center_to_crown_base = 39.0;
		crown_height = 5.85;
		crown_volume = 70.56;
		length_from_lowest_safe_belt_to_crown_base = 60.14;

		maxRPM = 6100.0;
		inertia = kgToInertia(4*0.230);

		check4warnings();
	}
}
