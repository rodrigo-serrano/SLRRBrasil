package java.game.parts.interior;

import java.game.parts.bodypart.*;


public class ATC_Volanti_KEYS extends SteeringWheel
{
	public ATC_Volanti_KEYS( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "ATC Volanti KEY'S RACING Edition";
		description = "";

		value = tHUF2USD(55);
		brand_new_prestige_value = 100.00;

		setMaxWear(kmToMaxWear(500000.0));

	}
}
