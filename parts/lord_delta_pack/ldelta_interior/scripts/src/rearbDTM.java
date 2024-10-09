package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class rearbDTM extends DecorativeBodyPart
{
	public rearbDTM( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Alfa Romeo 155 DTM rear bumper";
		description = "The professional racer rear bumper to Alfa Romeo 155.";

		value = tHUF2USD(59);
		brand_new_prestige_value = 55.00;
		setMaxWear(kmToMaxWear(250000.0));
	}
}
