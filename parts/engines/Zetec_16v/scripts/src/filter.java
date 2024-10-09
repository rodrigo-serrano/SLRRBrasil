package java.game.parts.engines.Zetec_16v;

import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;
import java.game.cars.*;

public class filter extends AirFilter
{
	public filter( int id )
	{
		super( id );
		name = "Cold Intake Zetec 16v";
		description = "";
		brand_new_prestige_value = 43.01;

		value = 55;

		stock_max_air_consumption = 0.3;
		setMaxWear(100000.0);
		dusted_efficiency = 0.25;

		check4warnings();
	}
}
