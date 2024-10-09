package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class volanteuno84 extends SteeringWheel
{
	public volanteuno84( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Fiat Uno steering wheel";
		description = "Fiat Uno steering wheel.";

		value = tHUF2USD(23);
		brand_new_prestige_value = 24.00;

		setMaxWear(kmToMaxWear(500000.0));

		diameter = 380.0;
		hub_depth = 5.0;
	}
}
