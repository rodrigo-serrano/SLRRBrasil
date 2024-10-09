package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class cop extends DecorativeBodyPart
{
	public cop( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Cop roof light";
		description = "";

		value = tHUF2USD(44);
		brand_new_prestige_value = 50.00;
		setMaxWear(kmToMaxWear(30000.0));

		police_check_fine_value	= 200.000;
	}
}
