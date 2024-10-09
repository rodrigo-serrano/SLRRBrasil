package java.game.parts.engines.SeriesKhonda;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class intakepipe extends ExhaustPipe
{
	public intakepipe( int id )
	{
		super( id );
		name = "Intake Street Honda Serie K";
		description = "";
		value = 68.18;
		setMaxWear(kmToMaxWear(500000.0));

		check4warnings();
	}
}
