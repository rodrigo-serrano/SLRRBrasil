package java.game.parts.engines.VR_6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;

public class vr_6_3_6_connecting_rods extends ConnectingRod
{
	public vr_6_3_6_connecting_rods( int id )
	{
		super( id );
		name = "Bielas VW VR6 3.6";
		description = "";

		brand_new_prestige_value = 40.01;
		value = tHUF2USD(6*6);
		setMaxWear(kmToMaxWear(348000.0));

		piston_slot_ID = 39;

		length = 152.0;

		maxRPM = 16000.0;
		inertia = kgToInertia(6*0.350);

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