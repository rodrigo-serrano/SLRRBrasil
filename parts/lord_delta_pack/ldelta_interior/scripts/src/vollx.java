package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class vollx extends SteeringWheel
{
	public vollx( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Lancia Y10 LX steering wheel";
		description = "";

		value = tHUF2USD(30);
		brand_new_prestige_value = 35.00;

		setMaxWear(kmToMaxWear(100000.0));

		diameter = 380.0;
		hub_depth = 5.0;
	}
}
