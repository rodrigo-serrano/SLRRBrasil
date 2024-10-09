package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class ritmo extends SteeringWheel
{
	public ritmo( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Fiat Ritmo Abarth steering wheel";
		description = "Fiat Ritmo Abarth steering wheel.";

		value = tHUF2USD(49);
		brand_new_prestige_value = 58.00;

		setMaxWear(kmToMaxWear(500000.0));

		diameter = 380.0;
		hub_depth = 5.0;
	}
}
