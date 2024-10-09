package java.game.parts.engines.Mega_i4_data;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class Shimutshibu_RC_X8550SR5_transmission_RWD_extension extends ReciprocatingEnginePart
{
	public Shimutshibu_RC_X8550SR5_transmission_RWD_extension( int id )
	{
		super( id );
		name = "Powertech transmission RWD extension";
		description = "";
		brand_new_prestige_value = 68.33;

		value = tHUF2USD(152);
		setMaxWear(kmToMaxWear(400000.0));

		maxRPM = 10000.0;
		inertia = kgToInertia(0.1);
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
