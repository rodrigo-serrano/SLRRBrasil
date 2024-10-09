package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class Alfa82 extends DecorativeBodyPart
{
	public Alfa82( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Adhesive gauge for Alfa Romeo 2300";
		description = "New look for you Alfa Romeo 2300, this adhesive makes your instrument panel as the Alfa Romeo 1982.";

		value = tHUF2USD(20);
		brand_new_prestige_value = 25.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
