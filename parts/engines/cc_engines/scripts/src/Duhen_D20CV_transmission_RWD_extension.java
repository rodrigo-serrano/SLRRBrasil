package java.game.parts.engines.cc_engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class Duhen_D20CV_transmission_RWD_extension extends ReciprocatingEnginePart
{
	public Duhen_D20CV_transmission_RWD_extension( int id )
	{
		super( id );
		name = "Universal Transmission RWD extension";
		description = "Para RUT";
		brand_new_prestige_value = 44.70;

		value = tHUF2USD(106);
		setMaxWear(kmToMaxWear(517000.0));

		maxRPM = 12000.0;
		inertia = kgToInertia(1.1);
	}

	public void fillDynoData( DynoData dd, int parentSlot )	//different in other (engine) part classes
	{
		super.fillDynoData( dd, parentSlot );

		if (the_car)
		{
			the_car.drive_type |= the_car.DT_RWD;
		}
	}
}
