package java.game.parts.mufflers;

import java.game.parts.enginepart.*;

public class muffler_03 extends ExhaustTip
{
	public muffler_03( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Ponteira Binotto Performance";
		description = "Ponteira Simples 3 Pol Full inox";

		value = tHUF2USD(75.000);
		brand_new_prestige_value = 50.00;
		setMaxWear(kmToMaxWear(500000.0));
	}
}
