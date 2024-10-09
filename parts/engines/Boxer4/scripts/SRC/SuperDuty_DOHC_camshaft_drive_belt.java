package java.game.parts.engines.Boxer4;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class SuperDuty_DOHC_camshaft_drive_belt extends EnginePart
{
	public SuperDuty_DOHC_camshaft_drive_belt( int id )
	{
		super( id );
		name = "Correia Dentada Subaru EJ";
		description = "";

		value = 250;
		brand_new_prestige_value = 25.55;
		setMaxWear(kmToMaxWear(30000.0));

		check4warnings();
	}
}
