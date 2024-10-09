package java.game.parts;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class defi_4bar extends TurboGaugeAnalog
{
	public defi_4bar( int id )
	{
		super( id );
		name = "Défi Turbo Gauge - 4 bar";
		description = "Manufacturer: Défi \n Weight: 0.250Kg \n Stage: aftermarket";
		catalog_view_ypr = new Ypr( 0.000, -0.750, 0.000 );

		value = tHUF2USD(70);
		brand_new_prestige_value = 25.0;
		
		tacho_num_regions = 2;
		tacho_value[0]	= -1.0;
		tacho_pos[0]	= 0.0;
		tacho_value[1]	= 0.0;
		tacho_pos[1]	= 90.0;
		tacho_value[2]	= 4.0;
		tacho_pos[2]	= 270.0;

       	addPart( parts.Turbo_Gauge:0x0000000Fr, "pin" );
		disableSlot(2,1); // tacho needle

	}

	public void resetAnim() // forces animation to reset
	{
		if( partOnSlot(2) )
			partOnSlot(2).setSlotPos( 1, new Vector3(0,0,0), new Ypr(0,0,0) );
	}
	
	public void setGaugeNeedlePos( float deg )
	{
		if( partOnSlot(2) )
			partOnSlot(2).setSlotPos( 1, new Vector3(0,0,0), new Ypr(0,0,deg2rad(deg)) );
	}
}

