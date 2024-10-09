package java.game.parts.engines.SeriesKhonda;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class pipe_turbo_exhaust_2 extends ExhaustPipe
{
	public pipe_turbo_exhaust_2( int id )
	{
		super( id );
		name = "Intercooler Drag Honda Serie K";
		description = "";
		value = 818.18;
		setMaxWear(kmToMaxWear(500000.0));

		check4warnings();
	}
}
