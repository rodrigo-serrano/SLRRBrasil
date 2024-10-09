package java.game.parts.engines.EA_211;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class escapamento_msi extends ExhaustHeader
{
	public escapamento_msi( int id )
	{
		super( id );
		name = "Escapamento EA-211 Msi";
		description = "";

		value = 150;
		brand_new_prestige_value = 153.28;
		setMaxWear(kmToMaxWear(330000.0));

		efficiency = 1.00;

		check4warnings();
	}
}
