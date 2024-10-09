package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class correia_ea111 extends Part
{
	public correia_ea111( int id )
	{
		super( id );
		name = "Correia Dentada Motor Vw Ea111";
		description = "";

		value = 100;
		brand_new_prestige_value = 25.55;
		setMaxWear(kmToMaxWear(50000.0));

		check4warnings();
	}
}
