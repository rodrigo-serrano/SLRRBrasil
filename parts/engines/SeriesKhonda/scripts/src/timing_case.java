package java.game.parts.engines.SeriesKhonda;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class timing_case extends Part
{
	public timing_case( int id )
	{
		super( id );
		name = "Capa Correia Dentada Honda Serie K";
		description = "";

		value = 181.81;
		brand_new_prestige_value = 27.55;
		setMaxWear(kmToMaxWear(220000.0));

		check4warnings();
	}

	public String isDynoable()
	{
		Part p;

		p = partOnSlot( 32 );
		if (!p)
			return "O Motor esta sem Alternador.";

		return super.isDynoable();
	}
}
