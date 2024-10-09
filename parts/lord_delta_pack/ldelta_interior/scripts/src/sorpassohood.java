package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class sorpassohood extends DecorativeBodyPart
{
	public sorpassohood( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Fiat 147 Sorpasso hood";
		description = "Stock hood.";

		value = tHUF2USD(52);
		brand_new_prestige_value = 35.00;
		setMaxWear(kmToMaxWear(210000.0));
	}
}
