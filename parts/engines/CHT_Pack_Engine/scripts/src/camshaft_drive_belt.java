package java.game.parts.engines.CHT_Pack_Engine;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class camshaft_drive_belt extends Part
{
	public camshaft_drive_belt( int id )
	{
		super( id );
		name = "Correia dentada motor CHT";
		description = "";

		value = tHUF2USD(1.236);
		brand_new_prestige_value = 25.55;
		setMaxWear(kmToMaxWear(18000.0));

		check4warnings();
	}
}
