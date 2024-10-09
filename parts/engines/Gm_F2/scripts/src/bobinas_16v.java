package java.game.parts.engines.Gm_F2;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class bobinas_16v extends Part
{
	public bobinas_16v( int id )
	{
		super( id );
		name = "Bobina e Cabos De Vela Chevrolet 16V";
		description = "";

		value = 400;
		brand_new_prestige_value = 76.64;
		setMaxWear(kmToMaxWear(1000000.0));

		check4warnings();
	}
}
