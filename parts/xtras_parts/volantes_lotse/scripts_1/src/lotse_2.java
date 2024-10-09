package java.game.parts.Lotse_big_block;

import java.game.parts.bodypart.*;


public class lotse_2 extends SteeringWheel
{
	public lotse_2( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Lotse big block";
		description = "Modelo por Joao Campos";

		value = tHUF2USD(110);
		brand_new_prestige_value = 200.00;

		setMaxWear(kmToMaxWear(500000.0));

		diameter = 380.0;
		hub_depth = 5.0;
	}
}
