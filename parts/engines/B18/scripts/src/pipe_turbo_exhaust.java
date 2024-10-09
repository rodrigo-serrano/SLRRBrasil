package java.game.parts.engines.B18;

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
		name = "Saida Turbina Honda Serie B";
		description = "";
		value = 200;
		setMaxWear(kmToMaxWear(500000.0));

		check4warnings();
	}
}
