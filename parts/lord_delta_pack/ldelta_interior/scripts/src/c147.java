package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class c147 extends DecorativeBodyPart
{
	public c147( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Fiat 147 C manual";
		description = "Know your car.";

		value = tHUF2USD(8);
		brand_new_prestige_value = 4.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
