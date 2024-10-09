package java.game.parts.engines.Mega_i4_data;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;
import java.game.cars.*;

public class Einvagen_Duhen_Ishima_Focer_turbocharger_air_out_pipe extends ExhaustHeader
{
	public Einvagen_Duhen_Ishima_Focer_turbocharger_air_out_pipe( int id )
	{
		super( id );
		name = "IDH piping";
		description = "";
		value = tHUF2USD(10);
		setMaxWear(kmToMaxWear(9500000.0));

		check4warnings();
	}


}
