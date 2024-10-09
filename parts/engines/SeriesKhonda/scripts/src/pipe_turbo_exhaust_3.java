package java.game.parts.engines.SeriesKhonda;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class pipe_turbo_exhaust_3 extends ExhaustPipe
{
	public pipe_turbo_exhaust_3( int id )
	{
		super( id );
		name = "Intercooler Street Honda Serie K";
		description = "";
		value = 454.54;
		setMaxWear(kmToMaxWear(500000.0));

		check4warnings();
	}
}
