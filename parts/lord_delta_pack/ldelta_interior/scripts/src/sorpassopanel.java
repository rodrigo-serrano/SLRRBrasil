package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class sorpassopanel extends DecorativeBodyPart
{
	public sorpassopanel( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Fiat 147 Sorpasso rear panel with logos";
		description = "The stock rear panel to 147 Sorpasso.";

		value = tHUF2USD(46);
		brand_new_prestige_value = 45.00;
		setMaxWear(kmToMaxWear(250000.0));
	}
}
