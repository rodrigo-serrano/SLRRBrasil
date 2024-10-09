package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class bancopas extends FrontSeat
{
	public bancopas( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Fiat 147 accessory passenger's seat";
		description = "Passenger's seat of the exclusive line of accessories for Fiat.";

		value = tHUF2USD(59.000);
		brand_new_prestige_value = 42.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
