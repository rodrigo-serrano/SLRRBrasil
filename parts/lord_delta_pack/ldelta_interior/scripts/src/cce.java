package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class cce extends DecorativeBodyPart
{
	public cce( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "CCE CM 500";
		description = "A classic AM / FM radio and tape player.";

		value = tHUF2USD(36);
		brand_new_prestige_value = 27.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
