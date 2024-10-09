package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class Gauge_Turbo extends DecorativeBodyPart
{
	public Gauge_Turbo( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Turbo Boost Gauge without support";
		description = "Adapted from Fiat Uno Turbo Diesel.";

		value = tHUF2USD(22);
		brand_new_prestige_value = 30.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
