package java.game.parts.engines.boxer_fusca;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class capela1600 extends EnginePart
{
	public capela1600( int id )
	{
		super( id );
		name = "Capela Baixa Motor Fusca 1600";
		description = "";
		brand_new_prestige_value = 10;

		value = 420;
		setMaxWear(kmToMaxWear(111000.0));

		check4warnings();
	}

}