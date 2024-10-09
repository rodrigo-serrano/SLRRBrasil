package java.game.parts.engines.Sevel;

import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;
import java.game.cars.*;

public class pressu_16v extends AirFilter
{
	public pressu_16v( int id )
	{
		super( id );
		name = "Pressurizacao Sevel 16v";
		description = "";
		brand_new_prestige_value = 43.01;

		value = 1200;

		stock_max_air_consumption = 0.3;
		setMaxWear(100000.0);
		dusted_efficiency = 0.25;

		check4warnings();
	}
}
