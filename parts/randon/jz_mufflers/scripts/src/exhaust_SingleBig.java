package java.game.parts;

import java.game.parts.enginepart.*;

public class exhaust_SingleBig extends ExhaustTip
{
	public exhaust_SingleBig( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Ponteira Big Single Direta";

		value = tHUF2USD(30.000);
		brand_new_prestige_value = 40.00;
		setMaxWear(kmToMaxWear(500000.0));
	}
}
