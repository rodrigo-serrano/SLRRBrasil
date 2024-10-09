package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class tetoab1 extends DecorativeBodyPart
{
	public tetoab1( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "LDelta Tuners Sunroof model A";
		description = "Sunroof open and paintable.";

		value = tHUF2USD(68);
		brand_new_prestige_value = 50.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
