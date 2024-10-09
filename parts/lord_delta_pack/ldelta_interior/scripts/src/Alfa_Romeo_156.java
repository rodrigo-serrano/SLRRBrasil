package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class Alfa_Romeo_156 extends SteeringWheel
{
	public Alfa_Romeo_156( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Alfa Romeo 156 wood steering wheel";
		description = "Steering wheel from Alfa Romeo 156.";

		value = tHUF2USD(43);
		brand_new_prestige_value = 51.00;

		setMaxWear(kmToMaxWear(500000.0));

		diameter = 380.0;
		hub_depth = 5.0;
	}
}
