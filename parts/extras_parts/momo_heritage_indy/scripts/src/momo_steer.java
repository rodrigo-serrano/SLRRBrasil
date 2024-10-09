package java.game.parts.MOMO_Heritage_Indy;

import java.game.parts.bodypart.*;


public class momo_steer extends SteeringWheel
{
	public momo_steer ( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "MOMO Heritage Indy";
		description = "";

		value = tHUF2USD(55);
		brand_new_prestige_value = 100.00;

		setMaxWear(kmToMaxWear(500000.0));

		diameter = 380.0;
		hub_depth = 9.0;
	}
}
