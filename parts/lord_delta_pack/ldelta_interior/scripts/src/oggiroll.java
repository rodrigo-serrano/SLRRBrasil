package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class oggiroll extends DecorativeBodyPart
{
	public oggiroll( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Chrome roll cage for Fiat Oggi";
		description = "Chrome roll cage for Fiat  Oggi.";

		value = tHUF2USD(90);
		brand_new_prestige_value = 20.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
