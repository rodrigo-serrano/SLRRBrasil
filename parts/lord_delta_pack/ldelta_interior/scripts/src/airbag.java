package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class airbag extends DecorativeBodyPart
{
	public airbag( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Steering wheel airbag";
		description = "";

		value = tHUF2USD(70);
		brand_new_prestige_value = 50.00;
		setMaxWear(kmToMaxWear(100000.0));

		police_check_fine_value	= 100.000;
	}
}
