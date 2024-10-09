package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class ar75 extends SteeringWheel
{
	public ar75( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Alfa Romeo 75 steering wheel";
		description = "Steering wheel from Alfa Romeo 75.";

		value = tHUF2USD(40);
		brand_new_prestige_value = 52.00;

		setMaxWear(kmToMaxWear(500000.0));

		diameter = 380.0;
		hub_depth = 5.0;
	}
}
