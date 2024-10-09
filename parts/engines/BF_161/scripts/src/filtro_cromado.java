package java.game.parts.engines.BF_161;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;


public class filtro_cromado extends AirFilter
{
	public filtro_cromado( int id )
	{
		super( id );
		name = "Filtro De Ar Cromado Willys Carburacao Simples";
		description = "";
		brand_new_prestige_value = 25.80;

		value = 100;

		stock_max_air_consumption = 0.3;
		setMaxWear(100000.0);
		dusted_efficiency = 0.25;

		check4warnings();
	}
}
