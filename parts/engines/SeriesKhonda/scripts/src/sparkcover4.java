package java.game.parts.engines.SeriesKhonda;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class sparkcover4 extends ExhaustPipe
{
	public sparkcover4( int id )
	{
		super( id );
		name = "Tampa Cabos De Vela Pintavel Serie K";
		description = "";
		value = 150;
		setMaxWear(kmToMaxWear(500000.0));

		check4warnings();
	}
}
