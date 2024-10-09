package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class pec extends DecorativeBodyPart
{
	public pec( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Fiat Parts Catalog";
		description = "Know your car.";

		value = tHUF2USD(7);
		brand_new_prestige_value = 4.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
