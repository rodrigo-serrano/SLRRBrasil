package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class Mac extends DecorativeBodyPart
{
	public Mac( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Car Jack";
		description = "Item mandatory safety, avoid fines.";

		value = tHUF2USD(12);
		brand_new_prestige_value = 5.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
