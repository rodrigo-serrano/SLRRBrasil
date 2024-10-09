package java.game.parts.engines.VIS_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class alternator_drive_belt_4cyl extends Part
{
	public alternator_drive_belt_4cyl( int id )
	{
		super( id );
		name = "Correia Alternador Fiat V.I.S. 1.8 16v";
		description = "";

		value = 50;
		brand_new_prestige_value = 25.55;
		setMaxWear(kmToMaxWear(30000.0));

		check4warnings();
	}
}
