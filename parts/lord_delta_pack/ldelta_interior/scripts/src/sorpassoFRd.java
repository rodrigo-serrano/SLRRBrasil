package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class sorpassoFRd extends DecorativeBodyPart
{
	public sorpassoFRd( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Fiat 147 Sorpasso right door decal";
		description = "Fiat 147 Sorpasso right door decal.";

		value = tHUF2USD(45);
		brand_new_prestige_value = 35.00;
		setMaxWear(kmToMaxWear(210000.0));
	}
}
