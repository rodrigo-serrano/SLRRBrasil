package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class fbumper155 extends DecorativeBodyPart
{
	public fbumper155( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Alfa Romeo 155 DTM front bumper";
		description = "The professional racer front bumper to Alfa Romeo 155.";

		value = tHUF2USD(68);
		brand_new_prestige_value = 85.00;
		setMaxWear(kmToMaxWear(250000.0));
	}
}
