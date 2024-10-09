package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class qcinz extends DecorativeBodyPart
{
	public qcinz( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Fiat 147 C instrument panel";
		description = "This instrument panel has a gray background.";

		value = tHUF2USD(36);
		brand_new_prestige_value = 27.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
