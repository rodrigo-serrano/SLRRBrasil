package java.game.parts.engines.Gm_F2;

import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;
import java.game.cars.*;

public class pressu_2e_baixo extends AirFilter
{
	public pressu_2e_baixo( int id )
	{
		super( id );
		name = "Pressurização Para 2e Kit Turbo Baixo GM F2 8v";
		description = "";
		brand_new_prestige_value = 55.01;

		value = 500;

		stock_max_air_consumption = 0.3;
		setMaxWear(100000.0);
		dusted_efficiency = 0.25;

		check4warnings();
	}
}
