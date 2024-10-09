package java.game.parts.engines.VR_6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class vr_6_racing_flywheel extends Flywheel
{
	public vr_6_racing_flywheel( int id )
	{
		super( id );
		name = "Volante De Motor De Corrida VW VR6";
		description = " ";

		value = tHUF2USD(80);
		brand_new_prestige_value = 51.09;
		setMaxWear(kmToMaxWear(760000.0));

		clutch_slot_ID = 36;

		maxRPM = 12000.0;
		inertia = kgToInertia(10.5);

		check4warnings();
	}
}