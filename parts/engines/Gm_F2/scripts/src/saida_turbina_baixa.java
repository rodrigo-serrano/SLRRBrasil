package java.game.parts.engines.Gm_F2;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class saida_turbina_baixa extends EnginePart
{
	public saida_turbina_baixa( int id )
	{
		super( id );
		name = "Toco Saida Escapamento 50/48 Motor GM F2";
		description = "";

		value = 150;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}
}
