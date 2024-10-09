package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class volante147gls extends SteeringWheel
{
	public volante147gls( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Fiat 147 GLS steering wheel";
		description = "Fiat 147 GLS steering wheel.";

		value = tHUF2USD(24);
		brand_new_prestige_value = 28.00;

		setMaxWear(kmToMaxWear(500000.0));

		diameter = 380.0;
		hub_depth = 5.0;
	}
}
