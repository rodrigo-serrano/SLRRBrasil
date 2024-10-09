package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class hflanc extends SteeringWheel
{
	public hflanc( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Lancia Delta HF Integrale steering wheel";
		description = "";

		value = tHUF2USD(35);
		brand_new_prestige_value = 35.00;

		setMaxWear(kmToMaxWear(200000.0));

		diameter = 380.0;
		hub_depth = 5.0;
	}
}
