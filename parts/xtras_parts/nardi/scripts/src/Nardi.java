package java.game.parts.interior.Nardi;

import java.game.parts.bodypart.*;


public class Nardi extends SteeringWheel
{
	public Nardi( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Nardi steering wheel";
		description = "lol";

		value = tHUF2USD(47.5);
		brand_new_prestige_value = 99999;

		setMaxWear(kmToMaxWear(500000.0));

		diameter = 350.0;
		hub_depth = 5.0;
	}
}
