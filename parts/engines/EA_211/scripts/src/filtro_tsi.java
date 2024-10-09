package java.game.parts.engines.EA_211;

import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;
import java.game.cars.*;

public class filtro_tsi extends AirFilter
{
	public filtro_tsi( int id )
	{
		super( id );
		name = "Filtro EA-211 Tsi";
		description = "";
		brand_new_prestige_value = 43.01;

		value = 175;

		stock_max_air_consumption = 0.3;
		setMaxWear(100000.0);
		dusted_efficiency = 0.25;

		check4warnings();
	}
}
