package java.game.parts.interior;

import java.game.parts.bodypart.*;


public class dspeed_recaro_stewart_rear extends RearSeat
{
	public dspeed_recaro_stewart_rear( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "DSpeed Recaro Inspired REAR seat - STEWART TARTAN fabric";
		description = "";

		value = tHUF2USD(125);
		brand_new_prestige_value = 300.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
