package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class f147ac extends SteeringWheel
{
	public f147ac( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Fiat 147 accessory steering wheel";
		description = "Steering wheel of the exclusive line of accessories for Fiat.";

		value = tHUF2USD(49);
		brand_new_prestige_value = 60.00;

		setMaxWear(kmToMaxWear(500000.0));

		diameter = 380.0;
		hub_depth = 5.0;
	}
}
