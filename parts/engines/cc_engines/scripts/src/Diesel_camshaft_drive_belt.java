package java.game.parts.engines.cc_engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class Diesel_camshaft_drive_belt extends EnginePart
{
	public Diesel_camshaft_drive_belt( int id )
	{
		super( id );
		name = "Cummins ISBe4 camshaft drive belt";
		description = "";

		value = tHUF2USD(5.5);
		brand_new_prestige_value = 8.35;
		setMaxWear(kmToMaxWear(180000.0));
	}
}
