package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class milano extends SteeringWheel
{
	public milano( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Alfa Romeo 75 Milano steering wheel";
		description = "Steering wheel from Alfa Romeo 75 Milano.";

		value = tHUF2USD(46);
		brand_new_prestige_value = 57.00;

		setMaxWear(kmToMaxWear(500000.0));

		diameter = 380.0;
		hub_depth = 5.0;
	}
}
