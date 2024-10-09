package java.game.parts.engines.Mega_i4_data;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;

public class Duhen_camshaft_bearing_bridge extends SlidingEnginePart
{
	public Duhen_camshaft_bearing_bridge( int id )
	{
		super( id );
		name = "Duratec/Zetec/CHT camshaft bearing bridge";
		description = "";

		value = tHUF2USD(2*7);
		brand_new_prestige_value = 22.35;
		setMaxWear(kmToMaxWear(250000.0));
	}
}
