package java.game.parts.engines.EA_211;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class correia_dentada extends Part
{
	public correia_dentada( int id )
	{
		super( id );
		name = "Correia dentada EA-211";
		description = "";

		value = 250;
		brand_new_prestige_value = 25.55;
		setMaxWear(kmToMaxWear(18000.0));

		check4warnings();
	}
}
