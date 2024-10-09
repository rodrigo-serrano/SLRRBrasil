package java.game.parts;

import java.game.parts.enginepart.*;

public class exhaust_SingleTip extends ExhaustTip
{
	public exhaust_SingleTip( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Ponteira Single Tip Direta";

		value = tHUF2USD(30.000);
		brand_new_prestige_value = 40.00;
		setMaxWear(kmToMaxWear(500000.0));
	}
}
