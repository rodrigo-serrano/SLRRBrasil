package java.game.parts.engines.SeriesKhonda;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class itbscoop1 extends ExhaustPipe
{
	public itbscoop1( int id )
	{
		super( id );
		name = "Scoop ITBs Honda Serie K";
		description = "";
		value = 68.18;
		setMaxWear(kmToMaxWear(500000.0));

		check4warnings();
	}
}
