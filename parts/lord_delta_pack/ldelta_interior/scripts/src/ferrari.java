package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class ferrari extends SteeringWheel
{
	public ferrari( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Ferrari wood steering wheel";
		description = "Steering wheel from model ti.";

		value = tHUF2USD(78);
		brand_new_prestige_value = 100.00;

		setMaxWear(kmToMaxWear(300000.0));

		diameter = 380.0;
		hub_depth = 5.0;
	}
}
