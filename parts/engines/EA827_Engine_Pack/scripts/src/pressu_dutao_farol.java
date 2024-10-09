package java.game.parts.engines.EA827_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class pressu_dutao_farol extends EnginePart
{
	public pressu_dutao_farol( int id )
	{
		super( id );
		name = "Pressurizacao Volkswagen AP 8v Passat Alemao";
		description = "";

		value = 300;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}
}
