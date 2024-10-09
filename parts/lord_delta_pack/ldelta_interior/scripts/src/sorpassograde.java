package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class sorpassograde extends DecorativeBodyPart
{
	public sorpassograde( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Fiat 147 Sorpasso radiator grille";
		description = "The stock radiator grille to 147 Sorpasso.";

		value = tHUF2USD(39);
		brand_new_prestige_value = 46.00;
		setMaxWear(kmToMaxWear(250000.0));
	}
}
