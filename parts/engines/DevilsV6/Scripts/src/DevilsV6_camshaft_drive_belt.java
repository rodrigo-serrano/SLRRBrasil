package java.game.parts.engines.DevilsV6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class DevilsV6_camshaft_drive_belt extends EnginePart
{
	public DevilsV6_camshaft_drive_belt( int id )
	{
		super( id );
		name = "Correia Dentada Motor V6";
		description = "";
		brand_new_prestige_value = 8.60;

		value = 300;
		setMaxWear(kmToMaxWear(40000.0));

		check4warnings();
	}
}
