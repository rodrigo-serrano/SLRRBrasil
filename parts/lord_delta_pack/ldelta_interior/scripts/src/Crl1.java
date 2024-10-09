package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class Crl1 extends DecorativeBodyPart
{
	public Crl1( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "L Rim Wrench 1";
		description = "Item mandatory safety, avoid fines.";

		value = tHUF2USD(8);
		brand_new_prestige_value = 4.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
