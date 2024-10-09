package java.game.parts.engines.CHT_Pack_Engine;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class alternator_drive_belt extends Part
{
	public alternator_drive_belt( int id )
	{
		super( id );
		name = "Correia do altenador motor CHT";
		description = "";

		value = tHUF2USD(0.811);
		brand_new_prestige_value = 25.55;
		setMaxWear(kmToMaxWear(30000.0));

		check4warnings();
	}
}
