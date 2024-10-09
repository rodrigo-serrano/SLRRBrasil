package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class sorpasso extends DecorativeBodyPart
{
	public sorpasso( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Fiat 147 Sorpasso instrument panel";
		description = "Instrument panel from 147 Sorpasso.";

		value = tHUF2USD(38);
		brand_new_prestige_value = 30.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
