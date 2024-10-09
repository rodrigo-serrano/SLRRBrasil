package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class doorspoid extends DecorativeBodyPart
{
	public doorspoid( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Alfa Romeo 155 right door wing";
		description = "";

		value = tHUF2USD(50);
		brand_new_prestige_value = 38.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
