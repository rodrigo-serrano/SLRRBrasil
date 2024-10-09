package java.game.parts.engines.DevilsV6;

import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;
import java.game.cars.*;

public class DevilsV6_turbo_air_filter_2 extends AirFilter
{
	public DevilsV6_turbo_air_filter_2( int id )
	{
		super( id );
		name = "Filtro Turbina 2 Motor V6";
		description = "";
		brand_new_prestige_value = 43.01;

		value = 120;

		stock_max_air_consumption = 0.3;
		setMaxWear(100000.0);
		dusted_efficiency = 0.25;

		check4warnings();
	}
}
