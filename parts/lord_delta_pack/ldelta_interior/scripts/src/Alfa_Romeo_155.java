package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class Alfa_Romeo_155 extends SteeringWheel
{
	public Alfa_Romeo_155( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Alfa Romeo 155 steering wheel";
		description = "Steering wheel from 1993.";

		value = tHUF2USD(38);
		brand_new_prestige_value = 50.00;

		setMaxWear(kmToMaxWear(500000.0));

		diameter = 380.0;
		hub_depth = 5.0;
	}
}
