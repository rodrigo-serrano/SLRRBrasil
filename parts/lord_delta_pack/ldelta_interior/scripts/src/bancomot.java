package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class bancomot extends FrontSeat
{
	public bancomot( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Fiat 147 accessory driver's seat";
		description = "Driver's seat of the exclusive line of accessories for Fiat.";

		value = tHUF2USD(59.000);
		brand_new_prestige_value = 42.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
