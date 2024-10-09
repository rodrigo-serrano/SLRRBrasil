package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class qgl extends DecorativeBodyPart
{
	public qgl( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Fiat 147 GL instrument panel";
		description = "This instrument panel has a black background.";

		value = tHUF2USD(41);
		brand_new_prestige_value = 35.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
