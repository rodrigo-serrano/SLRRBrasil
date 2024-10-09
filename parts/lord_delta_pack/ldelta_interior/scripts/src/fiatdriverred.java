package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class fiatdriverred extends FrontSeat
{
	public fiatdriverred( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Fiat 147 driver's seat with seat belt red";
		description = "The stock driver's seat with seat belt red.";

		value = tHUF2USD(52.000);
		brand_new_prestige_value = 38.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
