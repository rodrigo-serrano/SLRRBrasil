package java.game.parts.engines.DevilsV6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class DevilsV6_UpTurbo_intercooler_air_out_pipe_R extends EnginePart
{
	public DevilsV6_UpTurbo_intercooler_air_out_pipe_R( int id )
	{
		super( id );
		name = "Chargerpipe Turbina Alta Direita Alternativa Motor V6";
		description = "";
		brand_new_prestige_value = 8.60;

		value = 400;
		setMaxWear(kmToMaxWear(60000.0));

		check4warnings();
	}
}
