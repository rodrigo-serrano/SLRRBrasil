package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class Gauge_Tempagua extends DecorativeBodyPart
{
	public Gauge_Tempagua( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Water Temperature Gauge";
		description = "Adapted from Fiat Uno Turbo Diesel.";

		value = tHUF2USD(16);
		brand_new_prestige_value = 21.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
