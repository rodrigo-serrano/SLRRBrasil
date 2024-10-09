package java.game.parts.engines.VR_6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;

public class oil_cooler5 extends EnginePart
{
	public oil_cooler5( int id )
	{
		super( id );
		name = "Radiador De Oleo Racing VW VR6";
		description = " ";

		value = tHUF2USD(3.5);
		brand_new_prestige_value = 40.80;
		setMaxWear(kmToMaxWear(18000.0));

		check4warnings();
	}
}
