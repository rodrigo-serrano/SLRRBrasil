package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class y10roll extends DecorativeBodyPart
{
	public y10roll( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Lancia Y10 roll cage";
		description = "";

		value = tHUF2USD(68);
		brand_new_prestige_value = 80.00;
		setMaxWear(kmToMaxWear(100000.0));
	}
}
