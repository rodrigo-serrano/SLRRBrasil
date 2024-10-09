package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class sw extends DecorativeBodyPart
{
	public sw( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Fiat Tempra SW manual";
		description = "Know your car.";

		value = tHUF2USD(8);
		brand_new_prestige_value = 4.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
