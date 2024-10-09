package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class correia_tempra8v extends Part
{
	public correia_tempra8v( int id )
	{
		super( id );
		name = "Correia Dentada Fiat Twin Cam 2.0 8v";
		description = "";

		value = 100;
		brand_new_prestige_value = 25.55;
		setMaxWear(kmToMaxWear(50000.0));

		check4warnings();
	}
}
