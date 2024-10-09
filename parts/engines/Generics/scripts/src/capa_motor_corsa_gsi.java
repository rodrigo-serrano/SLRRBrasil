package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class capa_motor_corsa_gsi extends EnginePart
{
	public capa_motor_corsa_gsi( int id )
	{
		super( id );
		name = "Capa do motor GM F1 16v";
		description = "";

		value = 300;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}
}
