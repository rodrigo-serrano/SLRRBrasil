package java.game.parts.engines.boxer_fusca;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;


public class corneta_carburador_duplo extends AirFilter
{
	public corneta_carburador_duplo( int id )
	{
		super( id );
		name = "Corneta Carburador Duplo VW a Ar";
		description = "";
		brand_new_prestige_value = 25.80;

		value = 50;

		stock_max_air_consumption = 0.3;
		setMaxWear(100000.0);
		dusted_efficiency = 0.25;

		check4warnings();
	}
}
