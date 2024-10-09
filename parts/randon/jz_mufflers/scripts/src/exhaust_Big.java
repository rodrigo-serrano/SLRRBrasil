package java.game.parts;

import java.game.parts.enginepart.*;

public class exhaust_Big extends ExhaustTip
{
	public exhaust_Big( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Ponteira Big Jap-style";

		value = tHUF2USD(30.000);
		brand_new_prestige_value = 40.00;
		setMaxWear(kmToMaxWear(500000.0));
	}
}
