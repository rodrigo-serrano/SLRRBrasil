package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class rpmdi extends SteeringWheel
{
	public rpmdi( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "RPM Gauge sequential without support";
		description = "RPM Gauge sequential of Quark.";

		value = tHUF2USD(20);
		brand_new_prestige_value = 23.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
