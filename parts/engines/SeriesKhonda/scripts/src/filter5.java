package java.game.parts.engines.SeriesKhonda;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class filter5 extends ExhaustPipe
{
	public filter5( int id )
	{
		super( id );
		name = "Intake Turbina Honda Serie K";
		description = "";
		value = 85;
		setMaxWear(kmToMaxWear(500000.0));

		check4warnings();
	}
}
