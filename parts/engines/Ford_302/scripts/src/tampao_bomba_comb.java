package java.game.parts.engines.Ford_302;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class tampao_bomba_comb extends EnginePart
{
	public tampao_bomba_comb( int id )
	{
		super( id );
		name = "Tampao Bomba de Combustivel Ford 302";
		description = "";

		value = 350;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}
}
