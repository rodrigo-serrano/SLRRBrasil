package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class voltagcros extends DecorativeBodyPart
{
	public voltagcros( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Voltmeter Gauge without support";
		description = "Texture by Dicio Cross.";

		value = tHUF2USD(19);
		brand_new_prestige_value = 23.00;
		setMaxWear(kmToMaxWear(110000.0));
	}
}
