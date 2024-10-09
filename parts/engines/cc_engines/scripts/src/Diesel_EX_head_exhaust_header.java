package java.game.parts.engines.cc_engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;
import java.game.cars.*;


public class Diesel_EX_head_exhaust_header extends ExhaustHeader
{
	public Diesel_EX_head_exhaust_header( int id )
	{
		super( id );
		name = "Cummins ISBe4 exhaust header";
		description = "";
		brand_new_prestige_value = 32.15;

		value = tHUF2USD(4*5+15);
		setMaxWear(kmToMaxWear(21000000.0));

		efficiency = 1.35;
	}
}
