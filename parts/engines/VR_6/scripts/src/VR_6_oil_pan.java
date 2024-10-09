package java.game.parts.engines.VR_6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class VR_6_oil_pan extends OilPan
{
	public VR_6_oil_pan( int id )
	{
		super( id );
		name = "Carter VW VR6";
		description = " ";

		value = tHUF2USD(18);
		brand_new_prestige_value = 51.09;
		setMaxWear(kmToMaxWear(500000.0));

		friction_fwd = 0.0001;
		friction_rev = 0.0001;

		check4warnings();
        
	}

	public String isDynoable()
	{
		Part p;

		p = partOnSlot( 3 );
		if (!p)
			return "O Carter esta sem Parafusos.";

		return super.isDynoable();
	}
}
