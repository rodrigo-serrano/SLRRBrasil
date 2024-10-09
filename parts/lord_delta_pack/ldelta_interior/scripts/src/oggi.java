package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class oggi extends DecorativeBodyPart
{
	public oggi( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Fiat Oggi CS manual";
		description = "Know your car.";

		value = tHUF2USD(8);
		brand_new_prestige_value = 4.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
