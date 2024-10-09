package java.game.parts.interior;

import java.game.parts.bodypart.*;


public class dspeed_recaro_checkersblack_front extends FrontSeat
{
	public dspeed_recaro_checkersblack_front( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "DSpeed Recaro Inspired FRONT seat - CHECKERS BLACK fabric";
		description = "";

		value = tHUF2USD(75);
		brand_new_prestige_value = 300.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
