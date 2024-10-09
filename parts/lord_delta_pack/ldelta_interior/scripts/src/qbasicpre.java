package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class qbasicpre extends DecorativeBodyPart
{
	public qbasicpre( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Fiat 147 instrument panel with black background";
		description = "This instrument panel has a black background.";

		value = tHUF2USD(36);
		brand_new_prestige_value = 27.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
