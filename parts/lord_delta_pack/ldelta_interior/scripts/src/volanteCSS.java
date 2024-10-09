package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class volanteCSS extends SteeringWheel
{
	public volanteCSS( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Fiat Oggi CSS steering wheel";
		description = "Steering wheel from Fiat Oggi CSS, Spazio TR e 147 Racing.";

		value = tHUF2USD(30);
		brand_new_prestige_value = 32.00;

		setMaxWear(kmToMaxWear(500000.0));

		diameter = 380.0;
		hub_depth = 5.0;
	}
}
