package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class Gauge_Turbo2 extends DecorativeBodyPart
{
	public Gauge_Turbo2( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Turbo Boost Gauge";
		description = "Adapted from Fiat Uno Turbo i.e.";

		value = tHUF2USD(21);
		brand_new_prestige_value = 30.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
