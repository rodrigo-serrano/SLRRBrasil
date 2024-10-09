package java.game.parts.engines.Sevel;

import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;
import java.game.cars.*;

public class pressu_big_carburado extends AirFilter
{
	public pressu_big_carburado( int id )
	{
		super( id );
		name = "Pressurização Intercolada Carburador Hx35 Motor Sevel";
		description = "";
		brand_new_prestige_value = 43.01;

		value = 950;

		stock_max_air_consumption = 0.3;
		setMaxWear(100000.0);
		dusted_efficiency = 0.25;

		check4warnings();
	}
}
