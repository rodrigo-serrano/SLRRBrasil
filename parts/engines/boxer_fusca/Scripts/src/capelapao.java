package java.game.parts.engines.boxer_fusca;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class capelapao extends EnginePart
{
	public capelapao( int id )
	{
		super( id );
		name = "Capela Pao De Acucar Motor Fusca";
		description = "";
		brand_new_prestige_value = 10;

		value = 650;
		setMaxWear(kmToMaxWear(111000.0));

		check4warnings();
	}

}