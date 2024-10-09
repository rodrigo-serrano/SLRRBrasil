package java.game.parts.engines.Boxer4;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class SuperDuty_500_connecting_rods extends ConnectingRod
{
	public SuperDuty_500_connecting_rods( int id )
	{
		super( id );
		name = "Bielas Subaru EJ20";
		description = "connecting rods for EJ20.";
		brand_new_prestige_value = 71.68;

		value = 300;
		setMaxWear(kmToMaxWear(1413000.0));

		maxRPM = 11250.0;

		piston_slot_ID = 42;

		length = 152.00;

		inertia = kgToInertia(6*0.750);

		check4warnings();
	}

	public void addStockParts( Descriptor desc )
	{
		super.addStockParts( desc );

		getCar_LocalVersion();

		if (the_car.make == the_car.MAKE_MC)
		{
			if (the_car.model == MC_models.MODEL_GT)
			{
				addPart( parts.engines.MC_Prime_SuperDuty:0x00000101r, "MC_pistons", desc );
			}
			else
			if (the_car.model == MC_models.MODEL_GTB)
			{
				addPart( parts.engines.MC_Prime_SuperDuty:0x00000102r, "MC_GTB_pistons", desc );
			}
		}
	}
}
