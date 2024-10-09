package java.game.parts.engines.boxer_fusca;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class capela1200 extends EnginePart
{
	public capela1200( int id )
	{
		super( id );
		name = "Capela Motor Fusca 1200";
		description = "";
		brand_new_prestige_value = 10;

		value = 800;
		setMaxWear(kmToMaxWear(111000.0));

		check4warnings();
	}

}