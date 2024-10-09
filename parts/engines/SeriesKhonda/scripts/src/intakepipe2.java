package java.game.parts.engines.SeriesKhonda;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class intakepipe2 extends ExhaustPipe
{
	public intakepipe2( int id )
	{
		super( id );
		name = "Pressurizacao Sem Intercooler Honda Serie K";
		description = "";
		value = 250;
		setMaxWear(kmToMaxWear(500000.0));

		check4warnings();
	}
}
