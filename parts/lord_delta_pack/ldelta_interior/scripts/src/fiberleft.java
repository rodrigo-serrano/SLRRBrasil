package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class fiberleft extends DecorativeBodyPart
{
	public fiberleft( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Alfa Romeo 155 fiberglass rear left door";
		description = "";

		value = tHUF2USD(69);
		brand_new_prestige_value = 55.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
