package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class tuc extends DecorativeBodyPart
{
	public tuc( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Motoradio Tucano II";
		description = "A classic AM / FM radio and tape player.";

		value = tHUF2USD(38);
		brand_new_prestige_value = 28.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
