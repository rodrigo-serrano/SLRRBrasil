package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class Gauge_Pressoleo extends DecorativeBodyPart
{
	public Gauge_Pressoleo( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Oil Pressure Gauge";
		description = "Adapted from Fiat Uno Turbo Diesel.";

		value = tHUF2USD(18);
		brand_new_prestige_value = 22.00;
		setMaxWear(kmToMaxWear(100000.0));
	}
}
