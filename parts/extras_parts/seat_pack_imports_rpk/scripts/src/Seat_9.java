package java.game.parts;

import java.game.parts.bodypart.*;


public class Seat_9 extends FrontSeat
{
	public Seat_9( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "9";
		description = "Seat_Pack_Imports_RPK";

		value = tHUF2USD(300);
		brand_new_prestige_value = 300.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
