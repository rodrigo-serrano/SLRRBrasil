package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class wingrac extends DecorativeBodyPart
{
	public wingrac( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Fiat 147 Racing e Spazio TR roof wing";
		description = "A classic Fiat wing.";

		value = tHUF2USD(44);
		brand_new_prestige_value = 40.00;
		setMaxWear(kmToMaxWear(290000.0));
	}
}
