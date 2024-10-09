package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class Alfarpm extends DecorativeBodyPart
{
	public Alfarpm( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "RPM Gauge";
		description = "Gauge of Alfa Romeo 2300 1974.";

		value = tHUF2USD(25);
		brand_new_prestige_value = 25.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
