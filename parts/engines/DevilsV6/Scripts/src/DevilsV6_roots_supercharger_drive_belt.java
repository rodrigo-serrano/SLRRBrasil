package java.game.parts.engines.DevilsV6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;

public class DevilsV6_roots_supercharger_drive_belt extends EnginePart
{
	public DevilsV6_roots_supercharger_drive_belt( int id )
	{
		super( id );
		name = "Correia Supercharger Motor V6";
		description = "";
		brand_new_prestige_value = 48.60;

		value = 280;
		setMaxWear(kmToMaxWear(60000.0));

		check4warnings();
	}
}
