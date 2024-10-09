package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class volantepanorama extends SteeringWheel
{
	public volantepanorama( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Fiat Panorama steering wheel";
		description = "Steering wheel from Fiat Panorama and others Fiat 147.";

		value = tHUF2USD(23);
		brand_new_prestige_value = 23.00;

		setMaxWear(kmToMaxWear(500000.0));

		diameter = 380.0;
		hub_depth = 5.0;
	}
}
