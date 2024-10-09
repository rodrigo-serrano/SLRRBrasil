package java.game.parts.engines.Boxer4;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class SuperDuty_500_flywheel extends Flywheel
{
	public SuperDuty_500_flywheel( int id )
	{
		super( id );
		name = "Volante Motor Subaru EJ25";
		description = "";
		brand_new_prestige_value = 57.34;

		value = 200;
		setMaxWear(kmToMaxWear(760000.0));

		maxRPM = 17000.0;

		clutch_slot_ID = 4;

		inertia = kgToInertia(11.0);

		check4warnings();
	}

	public void addStockParts( Descriptor desc )
	{
		super.addStockParts( desc );

		addPart( parts.engines.MC_Prime_SuperDuty:0x00000084r, "clutch", desc );
	}
}
