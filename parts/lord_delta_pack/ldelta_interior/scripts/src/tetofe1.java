package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class tetofe1 extends DecorativeBodyPart
{
	public tetofe1( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "LDelta Tuners Sunroof model D";
		description = "Sunroof closed and paintable.";

		value = tHUF2USD(69);
		brand_new_prestige_value = 52.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
