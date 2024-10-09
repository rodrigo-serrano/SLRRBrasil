package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class racingem extends DecorativeBodyPart
{
	public racingem( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Fiat 147 Racing Logo";
		description = "Stock trunk logo to Fiat 147 Racing.";

		value = tHUF2USD(8);
		brand_new_prestige_value = 25.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
