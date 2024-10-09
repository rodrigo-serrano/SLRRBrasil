package java.game.parts.interior;

import java.game.parts.bodypart.*;


public class NardiDeepCornPolished extends SteeringWheel
{
	public NardiDeepCornPolished( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Nardi Deep Corn Polished";
		description = "";

		value = tHUF2USD(55);
		brand_new_prestige_value = 100.00;

		setMaxWear(kmToMaxWear(500000.0));

	}
}
