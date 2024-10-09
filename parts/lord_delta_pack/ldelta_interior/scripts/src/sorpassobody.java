package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class sorpassobody extends DecorativeBodyPart
{
	public sorpassobody( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Fiat 147 Sorpasso body decal";
		description = "Fiat 147 Sorpasso body decal.";

		value = tHUF2USD(50);
		brand_new_prestige_value = 45.00;
		setMaxWear(kmToMaxWear(210000.0));
	}
}
