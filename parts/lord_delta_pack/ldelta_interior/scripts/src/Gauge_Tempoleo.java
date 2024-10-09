package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class Gauge_Tempoleo extends DecorativeBodyPart
{
	public Gauge_Tempoleo( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Oil Temperature Gauge";
		description = "Adapted from Fiat Uno Turbo Diesel.";

		value = tHUF2USD(17);
		brand_new_prestige_value = 23.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
