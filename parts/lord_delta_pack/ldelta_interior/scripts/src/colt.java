package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class colt extends DecorativeBodyPart
{
	public colt( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Colt Trooper .357Mag";
		description = "";

		value = tHUF2USD(99);
		brand_new_prestige_value = 50.00;
		setMaxWear(kmToMaxWear(100000.0));

		police_check_fine_value	= 980.000;
	}
}
