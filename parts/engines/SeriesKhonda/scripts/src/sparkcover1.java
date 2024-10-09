package java.game.parts.engines.SeriesKhonda;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class sparkcover1 extends ExhaustPipe
{
	public sparkcover1( int id )
	{
		super( id );
		name = "Tampa Cabos De Vela Honda Serie K";
		description = "";
		value = 95;
		setMaxWear(kmToMaxWear(500000.0));

		check4warnings();
	}
}
