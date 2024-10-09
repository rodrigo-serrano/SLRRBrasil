package java.game.parts.engines.SeriesKhonda;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class sparkcover2 extends ExhaustPipe
{
	public sparkcover2( int id )
	{
		super( id );
		name = "Tampa Cabos De Vela Preta Honda Serie K";
		description = "";
		value = 95;
		setMaxWear(kmToMaxWear(500000.0));

		check4warnings();
	}
}
