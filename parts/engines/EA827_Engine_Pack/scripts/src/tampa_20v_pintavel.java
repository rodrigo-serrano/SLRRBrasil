package java.game.parts.engines.EA827_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class tampa_20v_pintavel extends Part
{
	public tampa_20v_pintavel( int id )
	{
		super( id );
		name = "Tampa De Cabecote Volkswagen AP 20v Pintavel";
		description = "";

		value = 250;
		brand_new_prestige_value = 76.64;
		setMaxWear(kmToMaxWear(1000000.0));

		check4warnings();
	}
}
