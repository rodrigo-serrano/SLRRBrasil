package java.game.parts.engines.VR_6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;


public class vr_6_3_6_fuel_rail extends FuelInjectorSystem
{
	public vr_6_3_6_fuel_rail( int id )
	{
		super( id );
		name = "Flauta De Combustivel VW VR6 3.6";
		description = " ";

		brand_new_prestige_value = 140.51;
		value = tHUF2USD(6*25+35);
		setMaxWear(kmToMaxWear(380000.0));

		max_fuel_consumption	= 0.04;
		default_mixture_ratio	= 14.0;
		default_fuel_type	= FT_GAS_100;
		mixture_ratio		= default_mixture_ratio;
		fuel_type		= default_fuel_type;
		calcStuffs();

		check4warnings();
        }

	public String isDynoable()
	{
		Part p;

		p = partOnSlot( 29 );
		if (!p)
			return "O Motor esta sem Linha De Combustivel.";

		return super.isDynoable();
	}
}