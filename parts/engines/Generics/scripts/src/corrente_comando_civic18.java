package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class corrente_comando_civic18 extends Part
{
	public corrente_comando_civic18( int id )
	{
		super( id );
		name = "Kit Corrente De Comando Honda 1.8 16v R18";
		description = "";

		value = 400;
		brand_new_prestige_value = 25.55;
		setMaxWear(kmToMaxWear(50000.0));

		check4warnings();
	}
}
