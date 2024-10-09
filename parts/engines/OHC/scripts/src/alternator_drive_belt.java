package java.game.parts.engines.OHC;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class alternator_drive_belt extends Part
{
	public alternator_drive_belt( int id )
	{
		super( id );
		name = "Correia do alternador OHC";
		description = "";

		value = tHUF2USD(2.811);
		brand_new_prestige_value = 25.55;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}
}
