package java.game.parts.interior;

import java.game.parts.bodypart.*;


public class Alpine_CDA9884 extends DecorativeBodyPart
{
	public Alpine_CDA9884( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Alpine CDA9884";
		description = "";

		value = tHUF2USD(22.11);
		brand_new_prestige_value = 50.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
