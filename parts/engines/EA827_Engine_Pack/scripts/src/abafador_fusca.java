package java.game.parts.engines.EA827_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class abafador_fusca extends EnginePart
{
	public abafador_fusca( int id )
	{
		super( id );
		name = "Saida Escapamento Fusca Com Abafador Parar VW AP 8v";
		description = "";

		value = 100;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}
}
