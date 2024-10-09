package java.game.parts.engines.Zetec_16v;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class alternator_drive_belt extends Part
{
	public alternator_drive_belt( int id )
	{
		super( id );
		name = "Correia do altenador motor Zetec 16v";
		description = "";

		value = 50;
		brand_new_prestige_value = 25.55;
		setMaxWear(kmToMaxWear(30000.0));

		check4warnings();
	}
}
