package java.game.parts.engines.Sevel;

import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;
import java.game.cars.*;

public class pressu_uno_turbo extends AirFilter
{
	public pressu_uno_turbo( int id )
	{
		super( id );
		name = "Pressurização Uno Turbo Mpi Motor Sevel";
		description = "";
		brand_new_prestige_value = 43.01;

		value = 700;

		stock_max_air_consumption = 0.3;
		setMaxWear(100000.0);
		dusted_efficiency = 0.25;

		check4warnings();
	}
}
