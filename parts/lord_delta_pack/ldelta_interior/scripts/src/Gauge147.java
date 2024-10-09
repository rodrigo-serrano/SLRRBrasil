package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class Gauge147 extends DecorativeBodyPart
{
	public Gauge147( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Oil Pressure Gauge without support";
		description = "Adapted from Fiat 147 acessory.";

		value = tHUF2USD(20);
		brand_new_prestige_value = 23.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
