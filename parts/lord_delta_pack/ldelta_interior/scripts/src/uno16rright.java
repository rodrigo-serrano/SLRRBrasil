package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class uno16rright extends FrontSeat
{
	public uno16rright( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Fiat Uno 1.6R passenger's used seat";
		description = "";

		value = tHUF2USD(52.000);
		brand_new_prestige_value = 40.00;
		setMaxWear(kmToMaxWear(100000.0));
	}
}
