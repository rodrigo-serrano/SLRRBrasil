package java.game.parts.engines.SeriesKhonda;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class itbscoop2 extends ExhaustPipe
{
	public itbscoop2( int id )
	{
		super( id );
		name = "Scoop Alternativo ITBs Honda Serie K";
		description = "";
		value = 68.18;
		setMaxWear(kmToMaxWear(500000.0));

		check4warnings();
	}
}
