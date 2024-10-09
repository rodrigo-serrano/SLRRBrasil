package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class correia_marea_1800 extends Part
{
	public correia_marea_1800( int id )
	{
		super( id );
		name = "Correia Dentada Motor Fiat Marea 1.8 16v";
		description = "";

		value = 100;
		brand_new_prestige_value = 25.55;
		setMaxWear(kmToMaxWear(50000.0));

		check4warnings();
	}
}
