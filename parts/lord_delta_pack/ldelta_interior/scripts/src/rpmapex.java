package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class rpmapex extends DecorativeBodyPart
{
	public rpmapex( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "RPM Gauge without support";
		description = "Texture by Dicio Cross.";

		value = tHUF2USD(20);
		brand_new_prestige_value = 23.00;
		setMaxWear(kmToMaxWear(100000.0));
	}
}
