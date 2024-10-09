package java.game.parts;

import java.game.parts.bodypart.*;


public class seat2 extends FrontSeat
{
	public seat2( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Kirkey negra";
		description = "By: Brandon Carrizo";

		value = tHUF2USD(300);
		brand_new_prestige_value = 300.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
