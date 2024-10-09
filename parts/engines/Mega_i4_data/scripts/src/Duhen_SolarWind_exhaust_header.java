package java.game.parts.engines.Mega_i4_data;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;
import java.game.cars.*;


public class Duhen_SolarWind_exhaust_header extends ExhaustHeader
{
	public Duhen_SolarWind_exhaust_header( int id )
	{
		super( id );
		name = "Duratec/Zetec/CHT exhaust header";
		description = "";
		brand_new_prestige_value = 25.15;

		value = tHUF2USD(4*5+10);
		setMaxWear(kmToMaxWear(210000.0));

		efficiency = 0.85;
	}
}
