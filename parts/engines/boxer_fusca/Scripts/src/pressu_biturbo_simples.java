package java.game.parts.engines.boxer_fusca;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;


public class pressu_biturbo_simples extends AirFilter
{
	public pressu_biturbo_simples( int id )
	{
		super( id );
		name = "Pressurizacao Para Bi-Turbo Com Carburador Simples VW a Ar";
		description = "";
		brand_new_prestige_value = 25.80;

		value = 600;

		stock_max_air_consumption = 0.3;
		setMaxWear(100000.0);
		dusted_efficiency = 0.25;

		check4warnings();
	}
}
