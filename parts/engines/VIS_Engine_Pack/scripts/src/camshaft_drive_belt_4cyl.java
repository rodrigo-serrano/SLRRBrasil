package java.game.parts.engines.VIS_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class camshaft_drive_belt_4cyl extends Part
{
	public camshaft_drive_belt_4cyl( int id )
	{
		super( id );
		name = "Correia Dentada Fiat V.I.S. 16v";
		description = "";

		value = 80;
		brand_new_prestige_value = 25.55;
		setMaxWear(kmToMaxWear(50000.0));

		check4warnings();
	}
}
