package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class falc extends DecorativeBodyPart
{
	public falc( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Motoradio Falcao";
		description = "A classic AM / FM radio and tape player.";

		value = tHUF2USD(42);
		brand_new_prestige_value = 34.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
