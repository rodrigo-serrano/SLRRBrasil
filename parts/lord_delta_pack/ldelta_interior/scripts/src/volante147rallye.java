package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class volante147rallye extends SteeringWheel
{
	public volante147rallye( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Fiat 147 Rallye steering wheel";
		description = "Fiat 147 Rallye steering wheel.";

		value = tHUF2USD(28);
		brand_new_prestige_value = 29.00;

		setMaxWear(kmToMaxWear(500000.0));

		diameter = 380.0;
		hub_depth = 5.0;
	}
}
