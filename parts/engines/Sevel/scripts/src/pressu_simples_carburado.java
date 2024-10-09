package java.game.parts.engines.Sevel;

import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;
import java.game.cars.*;

public class pressu_simples_carburado extends AirFilter
{
	public pressu_simples_carburado( int id )
	{
		super( id );
		name = "Pressurização Apl 42/48 Carburador Motor Sevel";
		description = "";
		brand_new_prestige_value = 43.01;

		value = 250;

		stock_max_air_consumption = 0.3;
		setMaxWear(100000.0);
		dusted_efficiency = 0.25;

		check4warnings();
	}
}
