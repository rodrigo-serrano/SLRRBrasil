package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class Alfa_Romeo_155_Elegant extends SteeringWheel
{
	public Alfa_Romeo_155_Elegant( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Alfa Romeo 155 Elegant steering wheel";
		description = "Steering wheel from Elegant 2.0 16V version.";

		value = tHUF2USD(42);
		brand_new_prestige_value = 55.00;

		setMaxWear(kmToMaxWear(500000.0));

		diameter = 380.0;
		hub_depth = 5.0;
	}
}
