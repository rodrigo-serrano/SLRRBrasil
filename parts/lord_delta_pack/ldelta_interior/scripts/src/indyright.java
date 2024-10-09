package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class indyright extends DecorativeBodyPart
{
	public indyright( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Flag Indy right mirror";
		description = "";

		value = tHUF2USD(12);
		brand_new_prestige_value = 125.00;
		setMaxWear(kmToMaxWear(87000.0));
	}
}
