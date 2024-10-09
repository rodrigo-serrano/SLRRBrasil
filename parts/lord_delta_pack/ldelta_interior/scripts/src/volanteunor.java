package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class volanteunor extends SteeringWheel
{
	public volanteunor( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Fiat Uno 1.6R steering wheel";
		description = "Fiat Uno 1.6R steering wheel.";

		value = tHUF2USD(29);
		brand_new_prestige_value = 29.00;

		setMaxWear(kmToMaxWear(500000.0));

		diameter = 380.0;
		hub_depth = 5.0;
	}
}
