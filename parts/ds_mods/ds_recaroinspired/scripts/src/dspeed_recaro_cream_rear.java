package java.game.parts.interior;

import java.game.parts.bodypart.*;


public class dspeed_recaro_cream_rear extends RearSeat
{
	public dspeed_recaro_cream_rear( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "DSpeed Recaro Inspired REAR seat - CREAM ALCANTARA leather";
		description = "";

		value = tHUF2USD(175);
		brand_new_prestige_value = 300.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
