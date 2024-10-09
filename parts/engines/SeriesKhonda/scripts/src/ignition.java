package java.game.parts.engines.SeriesKhonda;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class ignition extends ExhaustPipe
{
	public ignition( int id )
	{
		super( id );
		name = "Bobinas Ignicao Honda Serie K";
		description = "";
		value = 181.81;
		setMaxWear(kmToMaxWear(500000.0));

		check4warnings();
	}
}
