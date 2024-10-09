package java.game.parts.engines.chevrolet_250;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class balanceiros_custom extends EnginePart
{
	public balanceiros_custom( int id )
	{
		super( id );
		name = "Trem De Valvula Importado De Competicao Chevrolet 250";
		description = "";

		value = 3500;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}
}
