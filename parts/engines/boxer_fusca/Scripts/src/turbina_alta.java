package java.game.parts.engines.boxer_fusca;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;

public class turbina_alta extends TurboCharger
{
	public turbina_alta( int id )
	{
		super( id );
		name = "Turbina 50/48 Garret";
		description = "";

		value = 5500;
		brand_new_prestige_value = 130;

		calculateOptandRange (3500.0, 12500.0);
		P_turbo_max	= 3.51;
		default_P_turbo_waste	= 1.0;
		P_turbo_waste	= default_P_turbo_waste;

		max_waste	= 3.5;
		min_waste	= 0.5;
	}
}
