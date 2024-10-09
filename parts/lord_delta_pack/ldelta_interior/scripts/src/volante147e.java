package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class volante147e extends SteeringWheel
{
	public volante147e( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Fiat 147 steering wheel";
		description = "Fiat 147 steering wheel.";

		value = tHUF2USD(21);
		brand_new_prestige_value = 22.00;

		setMaxWear(kmToMaxWear(500000.0));

		diameter = 380.0;
		hub_depth = 5.0;
	}
}
