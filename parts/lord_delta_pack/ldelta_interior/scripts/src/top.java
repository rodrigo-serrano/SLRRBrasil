package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class top extends SteeringWheel
{
	public top( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Fiat 127 Top steering wheel";
		description = "";

		value = tHUF2USD(30);
		brand_new_prestige_value = 30.00;

		setMaxWear(kmToMaxWear(200000.0));

		diameter = 380.0;
		hub_depth = 5.0;
	}
}
