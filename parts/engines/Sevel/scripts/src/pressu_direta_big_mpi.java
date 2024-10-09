package java.game.parts.engines.Sevel;

import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;
import java.game.cars.*;

public class pressu_direta_big_mpi extends AirFilter
{
	public pressu_direta_big_mpi( int id )
	{
		super( id );
		name = "Pressurização Hx35 Injetado Motor Sevel";
		description = "";
		brand_new_prestige_value = 43.01;

		value = 200;

		stock_max_air_consumption = 0.3;
		setMaxWear(100000.0);
		dusted_efficiency = 0.25;

		check4warnings();
	}
}
