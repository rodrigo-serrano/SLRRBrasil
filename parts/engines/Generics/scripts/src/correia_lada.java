package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class correia_lada extends Part
{
	public correia_lada( int id )
	{
		super( id );
		name = "Correia Dentada Motor Lada 1.6 8v";
		description = "";

		value = 35;
		brand_new_prestige_value = 25.55;
		setMaxWear(kmToMaxWear(50000.0));

		check4warnings();
	}
}
