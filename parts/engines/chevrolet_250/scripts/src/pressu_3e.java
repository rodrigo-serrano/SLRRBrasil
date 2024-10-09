package java.game.parts.engines.chevrolet_250;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;


public class pressu_3e extends AirFilter
{
	public pressu_3e( int id )
	{
		super( id );
		name = "Pressurizacao Para Carburador 3e Chevrolet 250";
		description = "";
		brand_new_prestige_value = 25.80;

		value = 350;

		stock_max_air_consumption = 0.3;
		setMaxWear(100000.0);
		dusted_efficiency = 0.25;

		check4warnings();
	}
}
