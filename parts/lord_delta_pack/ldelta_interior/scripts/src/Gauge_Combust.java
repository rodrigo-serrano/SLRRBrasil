package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class Gauge_Combust extends DecorativeBodyPart
{
	public Gauge_Combust( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Fuel Gauge";
		description = "Adapted from Fiat Uno Turbo Diesel.";

		value = tHUF2USD(17);
		brand_new_prestige_value = 20.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
