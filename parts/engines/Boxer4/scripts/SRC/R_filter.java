package java.game.parts.engines.Boxer4;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class R_filter extends Part
{
	public R_filter( int id )
	{
		super( id );
		name = "Filtro Turbina Direita Subaru EJ";
		description = "";

		value = 150;
		brand_new_prestige_value = 25.55;
		setMaxWear(kmToMaxWear(18000.0));

		check4warnings();
	}
}
