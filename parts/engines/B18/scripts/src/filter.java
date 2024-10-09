package java.game.parts.engines.B18;

import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;
import java.game.cars.*;

public class filter extends AirFilter
{
	public filter( int id )
	{
		super( id );
		name = "Filtro Esportivo Honda Serie B";
		description = "";
		brand_new_prestige_value = 43.01;

		value = 200;

		stock_max_air_consumption = 0.3;
		setMaxWear(100000.0);
		dusted_efficiency = 0.25;

		check4warnings();
	}
}
