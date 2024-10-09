package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class manulaturb extends DecorativeBodyPart
{
	public manulaturb( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Fiat Uno Turbo manual";
		description = "Know your car.";

		value = tHUF2USD(10);
		brand_new_prestige_value = 4.00;
		setMaxWear(kmToMaxWear(100000.0));
	}
}
