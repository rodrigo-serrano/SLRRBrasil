package java.game.parts.interior;

import java.game.parts.bodypart.*;


public class Pioneer_DEH346 extends DecorativeBodyPart
{
	public Pioneer_DEH346( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Pioneer DEH-346";
		description = "";

		value = tHUF2USD(7.69);
		brand_new_prestige_value = 4.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
