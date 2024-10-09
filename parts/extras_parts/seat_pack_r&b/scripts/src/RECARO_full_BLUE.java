package java.game.parts;

import java.game.parts.bodypart.*;


public class Recaro_full_BLUE extends FrontSeat
{
	public Recaro_full_BLUE( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Recaro Pole Position Full Blue";
		description = "";

		value = tHUF2USD(300);
		brand_new_prestige_value = 300.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
