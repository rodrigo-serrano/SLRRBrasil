package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class TempraRoll extends DecorativeBodyPart
{
	public TempraRoll( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Fiat Tempra 4 doors and SW roll cage";
		description = "";

		value = tHUF2USD(70);
		brand_new_prestige_value = 80.00;
		setMaxWear(kmToMaxWear(100000.0));
	}
}
