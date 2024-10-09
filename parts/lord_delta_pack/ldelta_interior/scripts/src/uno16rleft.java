package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class uno16rleft extends FrontSeat
{
	public uno16rleft( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Fiat Uno 1.6R driver's used seat";
		description = "";

		value = tHUF2USD(52.000);
		brand_new_prestige_value = 40.00;
		setMaxWear(kmToMaxWear(100000.0));
	}
}
