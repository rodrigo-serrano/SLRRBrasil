package java.game.parts.engines.SeriesKhonda;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class pipe_turbo_exhaust extends ExhaustPipe
{
	public pipe_turbo_exhaust( int id )
	{
		super( id );
		name = "Downpipe Turbina Honda Serie K";
		description = "";
		value = 363.63;
		setMaxWear(kmToMaxWear(500000.0));

		check4warnings();
	}
}
