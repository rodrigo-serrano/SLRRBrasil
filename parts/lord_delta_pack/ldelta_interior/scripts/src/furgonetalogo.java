package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class furgonetalogo extends DecorativeBodyPart
{
	public furgonetalogo( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Fiat 147 Furgoneta Logo";
		description = "Stock trunk logo to Fiat 147 Furgoneta.";

		value = tHUF2USD(7);
		brand_new_prestige_value = 23.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
