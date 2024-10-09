package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class trwing extends DecorativeBodyPart
{
	public trwing( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Fiat Spazio TR wing with wiper";
		description = "A classic Fiat wing.";

		value = tHUF2USD(50);
		brand_new_prestige_value = 70.00;
		setMaxWear(kmToMaxWear(290000.0));
	}
}
