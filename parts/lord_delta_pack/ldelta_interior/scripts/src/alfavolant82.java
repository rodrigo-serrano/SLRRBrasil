package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class alfavolant82 extends SteeringWheel
{
	public alfavolant82( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Alfa Romeo 2300 ti steering wheel";
		description = "Steering wheel from model ti.";

		value = tHUF2USD(38);
		brand_new_prestige_value = 50.00;

		setMaxWear(kmToMaxWear(500000.0));

		diameter = 380.0;
		hub_depth = 5.0;
	}
}
