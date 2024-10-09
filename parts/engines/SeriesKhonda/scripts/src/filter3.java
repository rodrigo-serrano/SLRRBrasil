package java.game.parts.engines.SeriesKhonda;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class filter3 extends ExhaustPipe
{
	public filter3( int id )
	{
		super( id );
		name = "Filtro Turbina Honda Serie K";
		description = "";
		value = 80;
		setMaxWear(kmToMaxWear(500000.0));

		check4warnings();
	}
}
