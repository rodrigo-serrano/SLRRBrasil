package java.game.parts.engines.Gm_F2;

import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;
import java.game.cars.*;

public class corneta_weber extends AirFilter
{
	public corneta_weber( int id )
	{
		super( id );
		name = "Cornetas Weber 40 DCOE";
		description = "";
		brand_new_prestige_value = 55.01;

		value = 200;

		stock_max_air_consumption = 0.3;
		setMaxWear(100000.0);
		dusted_efficiency = 0.25;

		check4warnings();
	}
}
