package java.game.parts.engines.Mega_i4_data;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class Duhen_camshaft_drive_belt extends EnginePart
{
	public Duhen_camshaft_drive_belt( int id )
	{
		super( id );
		name = "Duratec/Zetec/CHT camshaft drive belt";
		description = "";

		value = tHUF2USD(2.5);
		brand_new_prestige_value = 3.35;
		setMaxWear(kmToMaxWear(18000.0));
	}
}
