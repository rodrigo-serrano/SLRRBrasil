package java.game.parts.engines.Gm_F2;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class distribuidor extends EnginePart
{
	public distribuidor( int id )
	{
		super( id );
		name = "Distribuidor Motor GM F2 8v";
		description = "";

		value = 120;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}
}
