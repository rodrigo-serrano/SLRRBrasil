package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class aguia extends DecorativeBodyPart
{
	public aguia( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Motoradio Aguia";
		description = "A classic AM / FM radio and tape player.";

		value = tHUF2USD(50);
		brand_new_prestige_value = 50.00;
		setMaxWear(kmToMaxWear(100000.0));
	}
}
