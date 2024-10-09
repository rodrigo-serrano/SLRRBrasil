package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class Trseg1 extends DecorativeBodyPart
{
	public Trseg1( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Warning Triangle 1";
		description = "Item mandatory safety, avoid fines.";

		value = tHUF2USD(7);
		brand_new_prestige_value = 1.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
