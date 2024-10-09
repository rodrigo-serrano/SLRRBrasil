package java.game.parts.engines.cc_engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;
import java.game.cars.*;


public class Einvagen_PerPro_GTA_exhaust_header extends ExhaustHeader
{
	public Einvagen_PerPro_GTA_exhaust_header( int id )
	{
		super( id );
		name = "Volkswagen AT 1.0 16v exhaust header";
		description = "";
		brand_new_prestige_value = 38.45;

		value = tHUF2USD(4*5+10);
		setMaxWear(kmToMaxWear(210000.0));

		efficiency = 0.85;
	}
}
