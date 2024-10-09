package java.game.parts.engines.VR_6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;

public class timing2_2 extends EnginePart
{
	public timing2_2( int id )
	{
		super( id );
		name = "Capa Corrente Comando Inferior Pintavel VW VR6";
		description = "";

		value = tHUF2USD(15);
		brand_new_prestige_value = 16.00;
		setMaxWear(kmToMaxWear(1000000.0));

		check4warnings();
	}

	public String isDynoable()
	{
		Part p;

		p = partOnSlot( 46 );
		if (!p)
			return "A Capa Inferior Da Corrente De Comando esta sem Parafusos.";

		return super.isDynoable();
	}
}

