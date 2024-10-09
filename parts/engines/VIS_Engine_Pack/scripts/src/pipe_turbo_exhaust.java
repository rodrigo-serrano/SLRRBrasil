package java.game.parts.engines.VIS_Engine_Pack;

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
		name = "Saida Turbina Fiat V.I.S.";
		description = "";
		value = 200;
		setMaxWear(kmToMaxWear(500000.0));

		check4warnings();
	}
}
