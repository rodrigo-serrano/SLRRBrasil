package java.game.parts.engines.VIS_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class alternator_drive_belt_5cyl extends Part
{
	public alternator_drive_belt_5cyl( int id )
	{
		super( id );
		name = "Correia Alternador Fiat V.I.S. 2.0/2.4 20v";
		description = "";

		value = 75;
		brand_new_prestige_value = 25.55;
		setMaxWear(kmToMaxWear(30000.0));

		check4warnings();
	}
}
