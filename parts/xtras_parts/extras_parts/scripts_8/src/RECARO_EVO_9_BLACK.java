package java.game.parts;

import java.game.parts.bodypart.*;


public class RECARO_EVO_9_BLACK extends FrontSeat
{
	public RECARO_EVO_9_BLACK( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Recaro EVO IX Black&White";
		description = "";

		value = tHUF2USD(300);
		brand_new_prestige_value = 300.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
