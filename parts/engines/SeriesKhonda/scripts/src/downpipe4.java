package java.game.parts.engines.SeriesKhonda;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class downpipe4 extends ExhaustPipe
{
	public downpipe4( int id )
	{
		super( id );
		name = "Downpipe Alternativo Turbina Honda Serie K";
		description = "";
		value = 200;
		setMaxWear(kmToMaxWear(500000.0));

		check4warnings();
	}
}
