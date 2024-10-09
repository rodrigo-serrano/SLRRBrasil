package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class corrente_comando_duratec extends Part
{
	public corrente_comando_duratec( int id )
	{
		super( id );
		name = "Kit Corrente Comando E Capa Dianteira Ford Duratec";
		description = "";

		value = 500;
		brand_new_prestige_value = 25.55;
		setMaxWear(kmToMaxWear(50000.0));

		check4warnings();
	}
}
