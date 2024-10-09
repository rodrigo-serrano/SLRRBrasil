package java.game.parts.mufflers;

import java.game.parts.enginepart.*;

public class muffler_01 extends ExhaustTip
{
	public muffler_01( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Abafador Duplo Binotto Performance";
		description = "Abafador Duplo 3 Pol Full inox";

		value = tHUF2USD(120.000);
		brand_new_prestige_value = 75.00;
		setMaxWear(kmToMaxWear(500000.0));
	}
}
