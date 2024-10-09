package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class volanterallyeabarth extends SteeringWheel
{
	public volanterallyeabarth( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Abarth steering wheel";
		description = "Steering wheel from Fiat 147 Rallye with logo Abarth.";

		value = tHUF2USD(31);
		brand_new_prestige_value = 30.00;

		setMaxWear(kmToMaxWear(500000.0));

		diameter = 380.0;
		hub_depth = 5.0;
	}
}
