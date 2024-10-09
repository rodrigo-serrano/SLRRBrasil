package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class damay10 extends SteeringWheel
{
	public damay10( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Lancia Y10 damaged steering wheel";
		description = "";

		value = tHUF2USD(22);
		brand_new_prestige_value = 22.00;

		setMaxWear(kmToMaxWear(100000.0));

		police_check_fine_value	= 100.000;

		diameter = 380.0;
		hub_depth = 5.0;
	}
}
