package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class gtagrill extends DecorativeBodyPart
{
	public gtagrill( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Alfa Romeo 155 GTA Cuore details";
		description = "";

		value = tHUF2USD(46);
		brand_new_prestige_value = 35.00;
		setMaxWear(kmToMaxWear(210000.0));
	}
}
