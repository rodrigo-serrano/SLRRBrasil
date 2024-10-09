package java.game.parts.interior;

import java.game.parts.bodypart.*;


public class momo_prototipo_oakwood extends SteeringWheel
{
	public momo_prototipo_oakwood( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Volante MOMO Prototipo Oakwood";
		description = "MOMO Steering wheel";

		value = tHUF2USD(110);
		brand_new_prestige_value = 200.00;

		setMaxWear(kmToMaxWear(500000.0));

		diameter = 380.0;
		hub_depth = 5.0;
	}
}
