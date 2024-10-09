package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class tetofe2 extends DecorativeBodyPart
{
	public tetofe2( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "LDelta Tuners Sunroof model E";
		description = "Glass sunroof and closed.";

		value = tHUF2USD(70);
		brand_new_prestige_value = 54.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
