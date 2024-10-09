package java.game.parts.engines.EA_211;

import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;
import java.game.cars.*;

public class filtro_stage2 extends AirFilter
{
	public filtro_stage2( int id )
	{
		super( id );
		name = "Filtro Esportivo KN EA-211 Tsi";
		description = "";
		brand_new_prestige_value = 43.01;

		value = 350;

		stock_max_air_consumption = 0.3;
		setMaxWear(100000.0);
		dusted_efficiency = 0.25;

		check4warnings();
	}
}
