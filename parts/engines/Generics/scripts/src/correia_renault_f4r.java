package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class correia_renault_f4r extends Part
{
	public correia_renault_f4r( int id )
	{
		super( id );
		name = "Correia Dentada Motor Renault 16v";
		description = "";

		value = 180;
		brand_new_prestige_value = 25.55;
		setMaxWear(kmToMaxWear(50000.0));

		check4warnings();
	}
}
