package java.game.parts.engines.DevilsV6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class DevilsV6_Turbo_R_exhaust_header extends ExhaustHeader_DevilsV6
{
	public DevilsV6_Turbo_R_exhaust_header( int id )
	{
		super( id );
		name = "Coletor Turbo Baixo Direito Motor V6";
		description = "";
		brand_new_prestige_value = 64.51;

		value = 1000;
		setMaxWear(kmToMaxWear(330000.0));

		efficiency = 0.9;

		check4warnings();
	}
}
