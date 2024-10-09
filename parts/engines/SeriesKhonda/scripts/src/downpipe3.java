package java.game.parts.engines.SeriesKhonda;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class downpipe3 extends ExhaustPipe
{
	public downpipe3( int id )
	{
		super( id );
		name = "Downpipe Turbina Honda Serie K";
		description = "";
		value = 200;
		setMaxWear(kmToMaxWear(500000.0));

		check4warnings();
	}
}
