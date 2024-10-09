package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class aqua extends DecorativeBodyPart
{
	public aqua( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Water Temperature Gauge without support";
		description = "From Veglia-Borletti.";

		value = tHUF2USD(19);
		brand_new_prestige_value = 23.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
