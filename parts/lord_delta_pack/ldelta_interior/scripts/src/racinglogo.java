package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class racinglogo extends DecorativeBodyPart
{
	public racinglogo( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Fiat 147 Racing left adhesive hood";
		description = "Fiat 147 Racing left decal.";

		value = tHUF2USD(9);
		brand_new_prestige_value = 11.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
