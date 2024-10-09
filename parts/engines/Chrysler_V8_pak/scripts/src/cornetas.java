package java.game.parts.engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class cornetas extends Part
{
	public cornetas( int id )
	{
		super( id );
		name = "Filtro Alto";
		description = "";

		value = 150;
		setMaxWear(100000.0);
		check4warnings();
	}

}