package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class walrodpnov extends SteeringWheel
{
	public walrodpnov( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Walrod Patrol steering wheel";
		description = "This a classic steering wheel.";

		value = tHUF2USD(52);
		brand_new_prestige_value = 50.00;

		setMaxWear(kmToMaxWear(500000.0));

		diameter = 380.0;
		hub_depth = 5.0;
	}
}
