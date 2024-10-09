package java.game.parts.engines.CHT_Pack_Engine;

import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;
import java.game.cars.*;

public class carb_body extends AirFilter
{
	public carb_body( int id )
	{
		super( id );
		name = "Corpo filtro de ar motor CHT";
		description = "";
		brand_new_prestige_value = 43.01;

		value = tHUF2USD(4.246);

		stock_max_air_consumption = 0.3;
		setMaxWear(100000.0);
		dusted_efficiency = 0.25;

		check4warnings();
	}
}
