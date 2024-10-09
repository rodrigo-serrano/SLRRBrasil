package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class oldabart extends SteeringWheel
{
	public oldabart( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Abarth used steering wheel";
		description = "Abarth steering wheel used.";

		value = tHUF2USD(19);
		brand_new_prestige_value = 20.00;

		setMaxWear(kmToMaxWear(100000.0));

		diameter = 380.0;
		hub_depth = 5.0;
	}
}
