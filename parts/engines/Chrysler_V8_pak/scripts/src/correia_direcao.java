package java.game.parts.engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class correia_direcao extends Part
{
	public correia_direcao( int id )
	{
		super( id );
		name = "Correia Direcao Hidraulica Dodge 318";
		description = "";

		value = 55;
		brand_new_prestige_value = 76.64;
		setMaxWear(kmToMaxWear(1000000.0));

		check4warnings();
	}
}
