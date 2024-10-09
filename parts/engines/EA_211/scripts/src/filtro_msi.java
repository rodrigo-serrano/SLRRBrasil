package java.game.parts.engines.EA_211;

import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;
import java.game.cars.*;

public class filtro_msi extends AirFilter
{
	public filtro_msi( int id )
	{
		super( id );
		name = "Filtro EA-211 Msi";
		description = "";
		brand_new_prestige_value = 43.01;

		value = 75;

		stock_max_air_consumption = 0.3;
		setMaxWear(100000.0);
		dusted_efficiency = 0.25;

		check4warnings();
	}
}
