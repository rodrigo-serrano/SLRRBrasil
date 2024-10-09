package java.game.parts.engines.VR_6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;

public class compressor_air_hose_kit_1 extends EnginePart
{
	public compressor_air_hose_kit_1( int id )
	{
		super( id );
		name = "Pressurizacao Supercharger VW VR6";
		description = "";

		value = tHUF2USD(15);
		brand_new_prestige_value = 16.00;
		setMaxWear(kmToMaxWear(1000000.0));

		check4warnings();
	}
}
