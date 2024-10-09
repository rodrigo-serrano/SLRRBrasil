package java.game.parts.engines.boxer_fusca;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;

public class turbina_esquerda extends TurboCharger
{
	public turbina_esquerda( int id )
	{
		super( id );
		name = "Turbina Esquerda Kit Bi-turbo VW a Ar";
		description = "";

		value = 2000;
		brand_new_prestige_value = 130;

		calculateOptandRange (100.0, 10000.0);
		P_turbo_max	= 7.52;
		default_P_turbo_waste	= 2.0;
		P_turbo_waste	= default_P_turbo_waste;

		max_waste	= 7.5;
		min_waste	= 0.2;
	}

	public void calculateOptandRange(float work_from, float work_to)
	{
		rpm_turbo_range = (work_to-work_from)*1.0;
		rpm_turbo_opt = work_from+rpm_turbo_range;
	}
}