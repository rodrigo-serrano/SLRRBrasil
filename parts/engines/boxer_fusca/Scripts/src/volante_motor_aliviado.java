package java.game.parts.engines.boxer_fusca;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class volante_motor_aliviado extends Flywheel
{
	public volante_motor_aliviado( int id )
	{
		super( id );
		name = "Volante Motor Aliviado Fusca";
		description = "";
		brand_new_prestige_value = 25;

		value = 250;
		setMaxWear(kmToMaxWear(760000.0));

		outer_radius = 360.0;

		maxRPM = 17000.0;

		clutch_slot_ID = 4;

		inertia = kgToInertia(3.0);

		check4warnings();
	}

}