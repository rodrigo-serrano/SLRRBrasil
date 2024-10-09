package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class road extends DecorativeBodyPart
{
	public road( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Roadstar Tape Player";
		description = "A classic AM / FM radio and tape player.";

		value = tHUF2USD(35);
		brand_new_prestige_value = 25.00;
		setMaxWear(kmToMaxWear(100000.0));
	}
}
