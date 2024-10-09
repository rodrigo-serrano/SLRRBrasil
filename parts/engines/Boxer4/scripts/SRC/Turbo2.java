package java.game.parts.engines.Boxer4;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;

public class Turbo2 extends TurboCharger
{
	public Turbo2( int id )
	{
		super( id );
		name = "Turbina HKS Lado Esquerdo Subaru EJ";
		description = "";

		value = 4500;
		brand_new_prestige_value = 109.30;

		calculateOptandRange (3200.0, 10000.0);
		P_turbo_max	= 2.00;
		default_P_turbo_waste	= 1.25;
		P_turbo_waste	= default_P_turbo_waste;

		max_waste	= 2.0;
		min_waste	= 1.0;
	}
}
