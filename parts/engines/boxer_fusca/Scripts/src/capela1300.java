package java.game.parts.engines.boxer_fusca;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class capela1300 extends EnginePart
{
	public capela1300( int id )
	{
		super( id );
		name = "Capela Motor Fusca 1300";
		description = "";
		brand_new_prestige_value = 10;

		value = 300;
		setMaxWear(kmToMaxWear(111000.0));

		check4warnings();
	}

}