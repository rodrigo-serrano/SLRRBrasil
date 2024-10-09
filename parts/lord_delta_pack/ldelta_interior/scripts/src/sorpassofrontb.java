package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class sorpassofrontb extends DecorativeBodyPart
{
	public sorpassofrontb( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Fiat 147 Sorpasso front bumper";
		description = "The stock front bumper to 147 Sorpasso.";

		value = tHUF2USD(51);
		brand_new_prestige_value = 46.00;
		setMaxWear(kmToMaxWear(250000.0));
	}
}
