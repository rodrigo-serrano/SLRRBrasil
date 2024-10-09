package java.game.parts.engines.EA827_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class saida_turbina_master extends EnginePart
{
	public saida_turbina_master( int id )
	{
		super( id );
		name = "Saida Turbina Volkswagen AP 8v Pulsativo No Farol";
		description = "";

		value = 150;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}
}
