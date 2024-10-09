package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class walrod extends SteeringWheel
{
	public walrod( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Walrod Patrol used steering wheel";
		description = "This a classic steering wheel.";

		value = tHUF2USD(29);
		brand_new_prestige_value = 30.00;

		setMaxWear(kmToMaxWear(100000.0));

		diameter = 380.0;
		hub_depth = 5.0;
	}
}
