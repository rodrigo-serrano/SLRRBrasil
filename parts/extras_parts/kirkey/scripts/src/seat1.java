package java.game.parts;

import java.game.parts.bodypart.*;


public class seat1 extends FrontSeat
{
	public seat1( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Kirkey Aluminio";
		description = "By: Brandon Carrizo";

		value = tHUF2USD(300);
		brand_new_prestige_value = 300.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
