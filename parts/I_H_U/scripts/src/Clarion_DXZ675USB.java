package java.game.parts.interior;

import java.game.parts.bodypart.*;


public class Clarion_DXZ675USB extends DecorativeBodyPart
{
	public Clarion_DXZ675USB( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Clarion DXZ675USB";
		description = "";

		value = tHUF2USD(26.92);
		brand_new_prestige_value = 50.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
