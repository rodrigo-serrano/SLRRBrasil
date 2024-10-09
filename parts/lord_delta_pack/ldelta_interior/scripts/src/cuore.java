package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class cuore extends DecorativeBodyPart
{
	public cuore( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Alfa Romeo 155 Paintable Cuore";
		description = "";

		value = tHUF2USD(25);
		brand_new_prestige_value = 35.00;
		setMaxWear(kmToMaxWear(215000.0));
	}
}
