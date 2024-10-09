package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class ld extends DecorativeBodyPart
{
	public ld( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Lord Delta Logo";
		description = "Lord Delta vehicles and acessories.";

		value = tHUF2USD(5);
		brand_new_prestige_value = 10.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
