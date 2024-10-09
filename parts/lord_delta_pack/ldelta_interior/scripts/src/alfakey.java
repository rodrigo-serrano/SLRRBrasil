package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class alfakey extends DecorativeBodyPart
{
	public alfakey( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Alfa Romeo red key";
		description = "";

		value = tHUF2USD(50);
		brand_new_prestige_value = 20.00;
		setMaxWear(kmToMaxWear(70000.0));
	}
}
