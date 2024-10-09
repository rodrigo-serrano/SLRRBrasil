package java.game.parts.interior;

import java.game.parts.bodypart.*;


public class momo_touring_cedarwood extends SteeringWheel
{
	public momo_touring_cedarwood( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Volante MOMO Touring Cedarwood";
		description = "MOMO Steering wheel";

		value = tHUF2USD(99);
		brand_new_prestige_value = 180.00;

		setMaxWear(kmToMaxWear(500000.0));

		diameter = 380.0;
		hub_depth = 5.0;
	}
}
