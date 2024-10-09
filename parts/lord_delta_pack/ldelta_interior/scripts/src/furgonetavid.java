package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class furgonetavid extends DecorativeBodyPart
{
	public furgonetavid( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Furgoneta rear windshield";
		description = "The stock rear windshield for Fiat 147 Furgoneta.";

		value = tHUF2USD(49);
		brand_new_prestige_value = 23.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
