package java.game.parts.engines.VR_6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;

public class vr_6_2_8_connecting_rods extends ConnectingRod
{
	public vr_6_2_8_connecting_rods( int id )
	{
		super( id );
		name = "Bielas VW VR6 2.8";
		description = " ";

		value = tHUF2USD(6*4);
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(278000.0));

		piston_slot_ID = 39;

		length = 142.5;

		maxRPM = 10000.0;
		inertia = kgToInertia(6*0.500);

		check4warnings();
	}

	public String isDynoable()
	{
		Part p;

		p = partOnSlot( 40 );
		if (!p)
			return "As Bielas estao sem Mancais.";

		return super.isDynoable();
	}
}