package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.cars.*;

public class cc_engines_turbocharger_air_out_pipe extends ExhaustHeader
{
	public cc_engines_turbocharger_air_out_pipe( int id )
	{
		super( id );
		name = "IDH piping";
		description = "";
		brand_new_prestige_value = 120;

		value = tHUF2USD(10);
		setMaxWear(kmToMaxWear(9500000.0));

		efficiency = 0.95;

		check4warnings();
	}


}
