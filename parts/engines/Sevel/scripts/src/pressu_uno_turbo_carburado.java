package java.game.parts.engines.Sevel;

import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;
import java.game.cars.*;

public class pressu_uno_turbo_carburado extends AirFilter
{
	public pressu_uno_turbo_carburado( int id )
	{
		super( id );
		name = "Pressurização Apl 42/48 Intercolado no Carburador Motor Sevel";
		description = "";
		brand_new_prestige_value = 43.01;

		value = 500;

		stock_max_air_consumption = 0.3;
		setMaxWear(100000.0);
		dusted_efficiency = 0.25;

		check4warnings();
	}
}
