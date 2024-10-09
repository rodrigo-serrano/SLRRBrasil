package java.game.parts.engines.Gm_F2;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class saida_turbina_alta extends EnginePart
{
	public saida_turbina_alta( int id )
	{
		super( id );
		name = "Toco Saida Escapamento Hx40 Motor GM F2";
		description = "";

		value = 200;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}
}
