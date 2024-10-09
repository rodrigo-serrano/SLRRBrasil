package java.game.parts.engines.OHC;

import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;
import java.game.cars.*;

public class filter extends AirFilter
{
	public filter( int id )
	{
		super( id );
		name = "OHC airfilter";
		description = "";
		brand_new_prestige_value = 43.01;

		value = tHUF2USD(10.246);

		stock_max_air_consumption = 0.3;
		setMaxWear(1000000.0);
		dusted_efficiency = 0.25;

		check4warnings();
	}
}
