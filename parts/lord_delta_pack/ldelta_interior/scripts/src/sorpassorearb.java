package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class sorpassorearb extends DecorativeBodyPart
{
	public sorpassorearb( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Fiat 147 Sorpasso rear bumper";
		description = "The stock rear bumper to 147 Sorpasso.";

		value = tHUF2USD(49);
		brand_new_prestige_value = 46.00;
		setMaxWear(kmToMaxWear(250000.0));
	}
}
