package java.game.parts.engines.B18;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class camshaft_drive_belt extends Part
{
	public camshaft_drive_belt( int id )
	{
		super( id );
		name = "Correia Dentada Honda Serie B";
		description = "";

		value = 200;
		brand_new_prestige_value = 25.55;
		setMaxWear(kmToMaxWear(50000.0));

		check4warnings();
	}
}
