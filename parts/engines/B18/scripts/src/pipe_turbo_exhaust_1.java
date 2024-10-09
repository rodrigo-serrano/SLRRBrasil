package java.game.parts.engines.B18;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class pipe_turbo_exhaust_1 extends ExhaustPipe
{
	public pipe_turbo_exhaust_1( int id )
	{
		super( id );
		name = "Saida Turbina Honda Serie B Alternativa";
		description = "";
		value = 200;
		setMaxWear(kmToMaxWear(500000.0));

		check4warnings();
	}
}
