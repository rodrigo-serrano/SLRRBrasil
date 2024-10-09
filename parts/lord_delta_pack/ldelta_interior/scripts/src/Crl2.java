package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class Crl2 extends DecorativeBodyPart
{
	public Crl2( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "L Rim Wrench 2";
		description = "Item mandatory safety, avoid fines.";

		value = tHUF2USD(7);
		brand_new_prestige_value = 3.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
