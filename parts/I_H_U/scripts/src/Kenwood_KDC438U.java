package java.game.parts.interior;

import java.game.parts.bodypart.*;


public class Kenwood_KDC438U extends DecorativeBodyPart
{
	public Kenwood_KDC438U( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Kenwood KDC-MP438U";
		description = "";

		value = tHUF2USD(26.95);
		brand_new_prestige_value = 50.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
