package java.game.parts.engines.SeriesKhonda;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class sparkcover3 extends ExhaustPipe
{
	public sparkcover3( int id )
	{
		super( id );
		name = "Tampa Cabos De Vela Mugen Serie K";
		description = "";
		value = 180;
		setMaxWear(kmToMaxWear(500000.0));

		check4warnings();
	}
}
