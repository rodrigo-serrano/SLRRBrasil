package java.game.parts.engines.OHC;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class camshaft_drive_belt extends Part
{
	public camshaft_drive_belt( int id )
	{
		super( id );
		name = "OHC camshaft drive belt";
		description = "";

		value = tHUF2USD(3.736);
		brand_new_prestige_value = 25.55;
		setMaxWear(kmToMaxWear(600000.0));

		check4warnings();
	}
}
