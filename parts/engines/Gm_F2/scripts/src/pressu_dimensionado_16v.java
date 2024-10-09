package java.game.parts.engines.Gm_F2;

import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;
import java.game.cars.*;

public class pressu_dimensionado_16v extends AirFilter
{
	public pressu_dimensionado_16v( int id )
	{
		super( id );
		name = "Pressurização Para GM F2 16v";
		description = "";
		brand_new_prestige_value = 55.01;

		value = 650;

		stock_max_air_consumption = 0.3;
		setMaxWear(100000.0);
		dusted_efficiency = 0.25;

		check4warnings();
	}
}
