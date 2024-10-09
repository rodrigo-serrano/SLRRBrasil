package java.game.parts;

import java.game.parts.bodypart.*;


public class RECARO_EVO_9_full_RED extends FrontSeat
{
	public RECARO_EVO_9_full_RED( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Recaro EVO IX Full Red";
		description = "";

		value = tHUF2USD(300);
		brand_new_prestige_value = 300.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
