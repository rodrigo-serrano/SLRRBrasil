package java.game.parts.engines.SeriesKhonda;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class alternator_drive_belt extends Part
{
	public alternator_drive_belt( int id )
	{
		super( id );
		name = "Correia Alternador Honda Serie K";
		description = "";

		value = 50;
		brand_new_prestige_value = 25.55;
		setMaxWear(kmToMaxWear(70000.0));

		check4warnings();
	}
}
