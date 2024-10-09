package java.game.parts;

import java.game.parts.bodypart.*;


public class RECARO_EVO_X_RED extends FrontSeat
{
	public RECARO_EVO_X_RED( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Recaro EVO X Red&Black";
		description = "";

		value = tHUF2USD(300);
		brand_new_prestige_value = 300.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
