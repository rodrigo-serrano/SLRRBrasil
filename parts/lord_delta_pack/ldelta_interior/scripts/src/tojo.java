package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class tojo extends DecorativeBodyPart
{
	public tojo( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "TOJO GR 100A Amplifier";
		description = "A classic amplifier and equalizer.";

		value = tHUF2USD(40);
		brand_new_prestige_value = 30.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
