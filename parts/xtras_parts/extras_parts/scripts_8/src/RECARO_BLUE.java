package java.game.parts;

import java.game.parts.bodypart.*;


public class Recaro_BLUE extends FrontSeat
{
	public Recaro_BLUE( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Recaro Pole Position Blue+Lettering";
		description = "";

		value = tHUF2USD(300);
		brand_new_prestige_value = 300.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
