package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class Trseg2 extends DecorativeBodyPart
{
	public Trseg2( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Warning Triangle 2";
		description = "Item mandatory safety, avoid fines.";

		value = tHUF2USD(6);
		brand_new_prestige_value = 1.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
