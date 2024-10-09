package java.game.parts.engines.Boxer4;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class SuperDuty_alternator_drive_belt extends EnginePart
{
	public SuperDuty_alternator_drive_belt( int id )
	{
		super( id );
		name = "Correia Alternador Subaru EJ";
		description = "";

		value = 30;
		brand_new_prestige_value = 25.55;
		setMaxWear(kmToMaxWear(30000.0));

		check4warnings();
	}
}
