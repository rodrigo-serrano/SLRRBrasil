package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class relog extends SteeringWheel
{
	public relog( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Clock Digital without support";
		description = "Clock Digital Quartzo of Quark.";

		value = tHUF2USD(20);
		brand_new_prestige_value = 23.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
