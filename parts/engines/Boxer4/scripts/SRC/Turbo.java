package java.game.parts.engines.Boxer4;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;

public class Turbo extends TurboCharger
{
	public Turbo( int id )
	{
		super( id );
		name = "Turbina Original Subaru EJ";
		description = "";

		value = 1800;
		brand_new_prestige_value = 60.30;

		calculateOptandRange (3000.0, 7666.0);
		P_turbo_max	= 1.50;
		default_P_turbo_waste	= 1.0;
		P_turbo_waste	= default_P_turbo_waste;

		max_waste	= 1.5;
		min_waste	= 0.5;
	}
}
