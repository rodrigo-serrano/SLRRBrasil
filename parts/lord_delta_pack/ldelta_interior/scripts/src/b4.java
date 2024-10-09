package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class b4 extends DecorativeBodyPart
{
	public b4( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Bosch 4 inch Speaker";
		description = "A classic speaker.";

		value = tHUF2USD(22);
		brand_new_prestige_value = 25.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
