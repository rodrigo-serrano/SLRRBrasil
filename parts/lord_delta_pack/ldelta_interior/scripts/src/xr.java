package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class xr extends DecorativeBodyPart
{
	public xr( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Ford Escort XR3 fog light";
		description = "A classic fog light.";

		value = tHUF2USD(30);
		brand_new_prestige_value = 50.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
