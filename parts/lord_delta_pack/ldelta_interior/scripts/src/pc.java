package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class pc extends DecorativeBodyPart
{
	public pc( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Notebook";
		description = "Textures by Dicio cross.";

		value = tHUF2USD(50);
		brand_new_prestige_value = 55.00;
		setMaxWear(kmToMaxWear(90000.0));
	}
}
