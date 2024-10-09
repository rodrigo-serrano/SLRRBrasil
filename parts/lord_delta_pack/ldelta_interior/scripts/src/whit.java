package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class whit extends DecorativeBodyPart
{
	public whit( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Cibie Serra II white";
		description = "A classic white fog light.";

		value = tHUF2USD(30);
		brand_new_prestige_value = 50.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
