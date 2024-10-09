package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class rearseat extends FrontSeat
{
	public rearseat( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Fiat 147 rear seat with seat belt red";
		description = "The stock rear seat with seat belt red.";

		value = tHUF2USD(48.000);
		brand_new_prestige_value = 42.00;
		setMaxWear(kmToMaxWear(210000.0));
	}
}
