package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class dedra extends SteeringWheel
{
	public dedra( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Lancia Dedra steering wheel";
		description = "";

		value = tHUF2USD(38);
		brand_new_prestige_value = 50.00;

		setMaxWear(kmToMaxWear(200000.0));

		diameter = 380.0;
		hub_depth = 5.0;
	}
}
