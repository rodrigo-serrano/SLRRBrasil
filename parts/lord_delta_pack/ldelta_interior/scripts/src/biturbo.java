package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class biturbo extends SteeringWheel
{
	public biturbo( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Maserati Biturbo steering wheel";
		description = "Steering wheel from Maserati Biturbo";

		value = tHUF2USD(50);
		brand_new_prestige_value = 55.00;

		setMaxWear(kmToMaxWear(500000.0));

		diameter = 380.0;
		hub_depth = 5.0;
	}
}
