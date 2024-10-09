package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class rallyegril extends DecorativeBodyPart
{
	public rallyegril( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Fiat 147 Rallye radiator grille";
		description = "The stock radiator grille to 147 Rallye Europa.";

		value = tHUF2USD(32);
		brand_new_prestige_value = 45.00;
		setMaxWear(kmToMaxWear(250000.0));
	}
}
