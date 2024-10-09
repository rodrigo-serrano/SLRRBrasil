package java.game.parts.interior;

import java.game.parts.bodypart.*;


public class Bravox_BVXD930 extends DecorativeBodyPart
{
	public Bravox_BVXD930( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Bravox BVX D930";
		description = "";

		value = tHUF2USD(38.46);
		brand_new_prestige_value = 50.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
