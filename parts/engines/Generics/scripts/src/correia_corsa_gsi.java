package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class correia_corsa_gsi extends Part
{
	public correia_corsa_gsi( int id )
	{
		super( id );
		name = "Correia Dentada Motor Familia 1 16v";
		description = "";

		value = 200;
		brand_new_prestige_value = 25.55;
		setMaxWear(kmToMaxWear(50000.0));

		check4warnings();
	}
}
