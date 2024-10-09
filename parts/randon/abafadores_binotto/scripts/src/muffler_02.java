package java.game.parts.mufflers;

import java.game.parts.enginepart.*;

public class muffler_02 extends ExhaustTip
{
	public muffler_02( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Abafador Simples Binotto Performance";
		description = "Abafador Simples 3 Pol Full inox";

		value = tHUF2USD(100.000);
		brand_new_prestige_value = 50.00;
		setMaxWear(kmToMaxWear(500000.0));
	}
}
