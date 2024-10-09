package java.game.parts.engines.DevilsV6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.cylinderhead.*;
import java.game.cars.*;


public class DevilsV6_Turbo_intercooler extends EnginePart
{
	public DevilsV6_Turbo_intercooler( int id )
	{
		super( id );
		name = "Intercooler Turbina Baixa Motor V6";
		description = "";
		brand_new_prestige_value = 28.67;

		value = 600;
		setMaxWear(kmToMaxWear(511000.0));

		check4warnings();
	}
}
