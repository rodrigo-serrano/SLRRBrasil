package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class ar33 extends SteeringWheel
{
	public ar33( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Alfa Romeo 33 wood steering wheel";
		description = "Steering wheel from Alfa Romeo 33.";

		value = tHUF2USD(43);
		brand_new_prestige_value = 54.00;

		setMaxWear(kmToMaxWear(500000.0));

		diameter = 380.0;
		hub_depth = 5.0;
	}
}
