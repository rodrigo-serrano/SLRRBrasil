package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class ar2300 extends SteeringWheel
{
	public ar2300( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Alfa Romeo 2300 steering wheel";
		description = "Steering wheel from first model.";

		value = tHUF2USD(40);
		brand_new_prestige_value = 50.00;

		setMaxWear(kmToMaxWear(500000.0));

		diameter = 380.0;
		hub_depth = 5.0;
	}
}
