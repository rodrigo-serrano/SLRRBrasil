package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class volantetempra extends SteeringWheel
{
	public volantetempra( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Fiat Tempra wood steering wheel";
		description = "Steering wheel of the exclusive line of accessories for Fiat.";

		value = tHUF2USD(32);
		brand_new_prestige_value = 32.00;

		setMaxWear(kmToMaxWear(500000.0));

		diameter = 380.0;
		hub_depth = 5.0;
	}
}
