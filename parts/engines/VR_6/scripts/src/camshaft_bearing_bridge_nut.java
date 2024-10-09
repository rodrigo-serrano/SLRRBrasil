package java.game.parts.engines.VR_6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;

public class camshaft_bearing_bridge_nut extends EnginePart
{
	public camshaft_bearing_bridge_nut( int id )
	{
		super( id );
		name = "Porcas Mancal De Comando VW VR6";
		description = "";

		value = tHUF2USD(15);
		brand_new_prestige_value = 16.00;
		setMaxWear(kmToMaxWear(1000000.0));

		check4warnings();
	}
}
