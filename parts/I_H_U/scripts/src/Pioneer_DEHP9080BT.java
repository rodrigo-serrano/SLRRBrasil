package java.game.parts.interior;

import java.game.parts.bodypart.*;


public class Pioneer_DEHP9080BT extends DecorativeBodyPart
{
	public Pioneer_DEHP9080BT( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Pioneer DEH-P9080BT";
		description = "";

		value = tHUF2USD(32.69);
		brand_new_prestige_value = 50.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
