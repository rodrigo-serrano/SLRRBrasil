package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class fiatpassengerred extends FrontSeat
{
	public fiatpassengerred( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Fiat 147 passenger's seat with seat belt red";
		description = "The stock passenger's seat with seat belt red.";

		value = tHUF2USD(52.000);
		brand_new_prestige_value = 38.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
