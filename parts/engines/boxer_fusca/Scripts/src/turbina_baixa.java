package java.game.parts.engines.boxer_fusca;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;

public class turbina_baixa extends TurboCharger
{
	public turbina_baixa( int id )
	{
		super( id );
		name = "Turbina 42/36 Apl";
		description = "";

		value = 2000;
		brand_new_prestige_value = 130;

		calculateOptandRange (1000.0, 8500.0);
		P_turbo_max	= 2.02;
		default_P_turbo_waste	= 1.0;
		P_turbo_waste	= default_P_turbo_waste;

		max_waste	= 2.2;
		min_waste	= 0.2;
	}
}
