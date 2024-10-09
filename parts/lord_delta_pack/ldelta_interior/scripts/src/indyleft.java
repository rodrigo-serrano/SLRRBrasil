package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class indyleft extends DecorativeBodyPart
{
	public indyleft( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Flag Indy left mirror";
		description = "";

		value = tHUF2USD(12);
		brand_new_prestige_value = 125.00;
		setMaxWear(kmToMaxWear(87000.0));
	}
}
