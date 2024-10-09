package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class sorpassowing extends DecorativeBodyPart
{
	public sorpassowing( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Fiat 147 Sorpasso wing";
		description = "A classic Fiat wing.";

		value = tHUF2USD(40);
		brand_new_prestige_value = 52.00;
		setMaxWear(kmToMaxWear(290000.0));
	}
}
