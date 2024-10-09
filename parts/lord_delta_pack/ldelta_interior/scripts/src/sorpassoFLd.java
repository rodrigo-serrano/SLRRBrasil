package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class sorpassoFLd extends DecorativeBodyPart
{
	public sorpassoFLd( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Fiat 147 Sorpasso left door decal";
		description = "Fiat 147 Sorpasso left door decal.";

		value = tHUF2USD(45);
		brand_new_prestige_value = 35.00;
		setMaxWear(kmToMaxWear(210000.0));
	}
}
