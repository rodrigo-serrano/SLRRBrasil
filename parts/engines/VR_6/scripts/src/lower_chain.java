package java.game.parts.engines.VR_6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;

public class lower_chain extends EnginePart
{
	public lower_chain( int id )
	{
		super( id );
		name = "Corrente Auxiliar VW VR6";
		description = " ";

		value = tHUF2USD(3.5);
		brand_new_prestige_value = 40.80;
		setMaxWear(kmToMaxWear(18000.0));

		check4warnings();
	}
}
