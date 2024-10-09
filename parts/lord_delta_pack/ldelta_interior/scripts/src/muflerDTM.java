package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class muflerDTM extends DecorativeBodyPart
{
	public muflerDTM( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Alfa Romeo 155 DTM double exhaust pipe";
		description = "";

		value = tHUF2USD(85);
		brand_new_prestige_value = 56.00;
		setMaxWear(kmToMaxWear(1550000.0));
	}
}
