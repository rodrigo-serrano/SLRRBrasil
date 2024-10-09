package java.game.parts.engines.DevilsV6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class DevilsV6_Turbo_air_out_pipe_L extends EnginePart
{
	public DevilsV6_Turbo_air_out_pipe_L( int id )
	{
		super( id );
		name = "Pressurizacao Turbina Esquerda Motor V6";
		description = "";
		brand_new_prestige_value = 8.60;

		value = 250;
		setMaxWear(kmToMaxWear(60000.0));

		check4warnings();
	}
}
