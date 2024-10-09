package java.game.parts.engines.CHE_C20XE;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;
import java.game.cars.*;


public class c20xe_exhaust_header extends ExhaustHeader
{
	public c20xe_exhaust_header( int id )
	{
		super( id );
		name = "C20XE FWD exhaust header";
		description = "";
		brand_new_prestige_value = 38.45;

		value = tHUF2USD(4*5+10);
		setMaxWear(kmToMaxWear(210000.0));

		efficiency = 0.92;
	}
}