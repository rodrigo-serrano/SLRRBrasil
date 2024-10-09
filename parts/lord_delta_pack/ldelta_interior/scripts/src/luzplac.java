package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class luzplac extends DecorativeBodyPart
{
	public luzplac( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Fiat 147 license plate light";
		description = "Stock license plate light.";

		value = tHUF2USD(14);
		brand_new_prestige_value = 23.00;
		setMaxWear(kmToMaxWear(240000.0));
	}
}
