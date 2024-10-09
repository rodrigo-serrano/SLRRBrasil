package java.game.parts.engines.B18;

import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;
import java.game.cars.*;

public class filter_1 extends AirFilter
{
	public filter_1( int id )
	{
		super( id );
		name = "Filtro De Ar Original Honda Serie B";
		description = "";
		brand_new_prestige_value = 43.01;

		value = 135;

		stock_max_air_consumption = 0.3;
		setMaxWear(100000.0);
		dusted_efficiency = 0.25;

		check4warnings();
	}
}
