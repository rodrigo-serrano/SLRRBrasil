package java.game.parts.mufflers;

import java.game.parts.enginepart.*;

public class muffler_04 extends ExhaustTip
{
	public muffler_04( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Ponteira Dupla Longa Binotto Performance";
		description = "Ponteira Dupla 2,5 Pol Full inox";

		value = tHUF2USD(150.000);
		brand_new_prestige_value = 80.00;
		setMaxWear(kmToMaxWear(500000.0));
	}
}
