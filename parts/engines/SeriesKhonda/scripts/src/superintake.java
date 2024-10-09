package java.game.parts.engines.SeriesKhonda;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class superintake extends ExhaustPipe
{
	public superintake( int id )
	{
		super( id );
		name = "Intake Supercharger Honda Serie K";
		description = "";
		value = 181.81;
		setMaxWear(kmToMaxWear(500000.0));

		check4warnings();
	}
}
