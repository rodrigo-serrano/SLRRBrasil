package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class tem extends DecorativeBodyPart
{
	public tem( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Fiat Tempra manual";
		description = "Know your car.";

		value = tHUF2USD(8);
		brand_new_prestige_value = 4.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
