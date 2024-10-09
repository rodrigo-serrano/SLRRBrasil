package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class tetoab3 extends DecorativeBodyPart
{
	public tetoab3( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "LDelta Tuners Sunroof model C";
		description = "Glass sunroof and open.";

		value = tHUF2USD(72);
		brand_new_prestige_value = 54.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
