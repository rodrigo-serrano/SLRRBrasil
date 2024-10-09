package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class b69 extends DecorativeBodyPart
{
	public b69( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Bosch 6x9 inch Speaker";
		description = "A classic speaker.";

		value = tHUF2USD(31);
		brand_new_prestige_value = 31.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
