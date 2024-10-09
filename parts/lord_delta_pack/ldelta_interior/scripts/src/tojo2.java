package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class tojo2 extends DecorativeBodyPart
{
	public tojo2( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "TOJO GR 300 Amplifier";
		description = "A classic amplifier and equalizer.";

		value = tHUF2USD(49);
		brand_new_prestige_value = 40.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
