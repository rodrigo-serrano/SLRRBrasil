package java.game.parts.engines.CHT_Pack_Engine;

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
		name = "Tubulacao escape turbo motor CHT";
		description = "";
		value = tHUF2USD(8);
		setMaxWear(kmToMaxWear(500000.0));

		check4warnings();
	}
}
