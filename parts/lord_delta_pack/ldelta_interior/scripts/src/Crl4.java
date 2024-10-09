package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class Crl4 extends DecorativeBodyPart
{
	public Crl4( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "L Rim Wrench 3";
		description = "Item mandatory safety, avoid fines.";

		value = tHUF2USD(9);
		brand_new_prestige_value = 5.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
