package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class spark extends DecorativeBodyPart
{
	public spark( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Spark Plug";
		description = "";

		value = tHUF2USD(7);
		brand_new_prestige_value = 25.00;
		setMaxWear(kmToMaxWear(80000.0));
	}
}
