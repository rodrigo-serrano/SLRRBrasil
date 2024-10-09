package java.game.parts.engines.Zetec_16v;

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
		name = "Tubulacao escape turbo motor Zetec 16v";
		description = "";
		value = 120;
		setMaxWear(kmToMaxWear(500000.0));

		check4warnings();
	}
}
