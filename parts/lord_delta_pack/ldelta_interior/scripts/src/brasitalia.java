package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class brasitalia extends DecorativeBodyPart
{
	public brasitalia( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Brasitalia Logo";
		description = "";

		value = tHUF2USD(5);
		brand_new_prestige_value = 10.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
