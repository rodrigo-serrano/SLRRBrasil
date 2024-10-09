package java.game.parts.engines.Zetec_16v;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class camshaft_drive_belt extends Part
{
	public camshaft_drive_belt( int id )
	{
		super( id );
		name = "Correia dentada motor Zetec 16v";
		description = "";

		value = 120;
		brand_new_prestige_value = 25.55;
		setMaxWear(kmToMaxWear(18000.0));

		check4warnings();
	}
}
