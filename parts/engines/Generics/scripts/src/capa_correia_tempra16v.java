package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class capa_correia_tempra16v extends EnginePart
{
	public capa_correia_tempra16v( int id )
	{
		super( id );
		name = "Capa da correia dentada Fiat Twin Cam 2.0 16v";
		description = "";

		value = 150;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}
}
