package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class iava extends SteeringWheel
{
	public iava( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Fiat 147 Sorpasso steering wheel";
		description = "Fiat 147 Sorpasso steering wheel.";

		value = tHUF2USD(34);
		brand_new_prestige_value = 32.00;

		setMaxWear(kmToMaxWear(500000.0));

		diameter = 380.0;
		hub_depth = 5.0;
	}
}
