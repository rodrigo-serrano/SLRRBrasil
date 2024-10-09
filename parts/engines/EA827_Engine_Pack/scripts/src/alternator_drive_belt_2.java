package java.game.parts.engines.EA827_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class alternator_drive_belt_2 extends Part
{
	public alternator_drive_belt_2( int id )
	{
		super( id );
		name = "Correia Alternador Baixo Volkswagen AP";
		description = "";

		value = 65;
		brand_new_prestige_value = 25.55;
		setMaxWear(kmToMaxWear(30000.0));

		check4warnings();
	}
}
