package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class racing extends DecorativeBodyPart
{
	public racing( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Fiat 147 Rallye and Racing Dashboard Gauges";
		description = "Gauges of oil pressure and voltmeter.";

		value = tHUF2USD(36);
		brand_new_prestige_value = 36.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
