package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class qralye extends DecorativeBodyPart
{
	public qralye( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Fiat 147 Rallye instrument panel";
		description = "This instrument panel has a black background and RPM gauge.";

		value = tHUF2USD(50);
		brand_new_prestige_value = 45.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
