package java.game.parts.engines.Gm_F2;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class tampa_correia_16v extends Part
{
	public tampa_correia_16v( int id )
	{
		super( id );
		name = "Tampa Correia Dentada Chevrolet 16V";
		description = "";

		value = 200;
		brand_new_prestige_value = 76.64;
		setMaxWear(kmToMaxWear(1000000.0));

		check4warnings();
	}
}
