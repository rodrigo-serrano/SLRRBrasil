package java.game.parts.engines.Sevel;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class correia_16v extends Part
{
	public correia_16v( int id )
	{
		super( id );
		name = "Correia Dentada Motor Sevel 16v";
		description = "";

		value = 220;
		brand_new_prestige_value = 25.55;
		setMaxWear(kmToMaxWear(50000.0));

		check4warnings();
	}
}
