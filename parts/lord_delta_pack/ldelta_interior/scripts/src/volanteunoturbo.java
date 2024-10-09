package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class volanteunoturbo extends SteeringWheel
{
	public volanteunoturbo( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Fiat Uno Turbo ie steering wheel";
		description = "Fiat Uno Turbo ie steering wheel.";

		value = tHUF2USD(32);
		brand_new_prestige_value = 33.00;

		setMaxWear(kmToMaxWear(500000.0));

		diameter = 380.0;
		hub_depth = 5.0;
	}
}
