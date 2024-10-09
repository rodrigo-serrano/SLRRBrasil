package java.game.parts.interior;

import java.game.parts.bodypart.*;


public class ATC_Volanti_Sportivi extends SteeringWheel
{
	public ATC_Volanti_Sportivi( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "ATC Volanti Sportivi";
		description = "";

		value = tHUF2USD(55);
		brand_new_prestige_value = 100.00;

		setMaxWear(kmToMaxWear(500000.0));

	}
}
