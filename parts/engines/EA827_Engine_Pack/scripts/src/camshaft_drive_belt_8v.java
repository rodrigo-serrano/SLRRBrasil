package java.game.parts.engines.EA827_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class camshaft_drive_belt_8v extends Part
{
	public camshaft_drive_belt_8v( int id )
	{
		super( id );
		name = "Correia Dentada Volkswagen AP 8v";
		description = "";

		value = 55;
		brand_new_prestige_value = 25.55;
		setMaxWear(kmToMaxWear(18000.0));

		check4warnings();
	}
}
