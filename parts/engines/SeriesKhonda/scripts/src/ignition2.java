package java.game.parts.engines.SeriesKhonda;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class ignition2 extends ExhaustPipe
{
	public ignition2( int id )
	{
		super( id );
		name = "Bobinas Ignicao Capacitativa Honda Serie K";
		description = "";
		value = 363.63;
		setMaxWear(kmToMaxWear(500000.0));

		check4warnings();
	}
}
