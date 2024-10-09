package java.game.parts.engines.Gm_F2;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class correia_dentada_16v extends Part
{
	public correia_dentada_16v( int id )
	{
		super( id );
		name = "Correia Dentada Motor GM F2 16v";
		description = "";

		value = 300;
		brand_new_prestige_value = 25.55;
		setMaxWear(kmToMaxWear(50000.0));

		check4warnings();
	}
}
