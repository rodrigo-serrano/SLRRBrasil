package java.game.parts;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Tachometer_black2 extends TachometerAnalog
{
	public Tachometer_black2( int id )
	{
		super( id );
		name = "Cronomac Black Series Tachometer (green glow)";
		description = "Manufacturer: Cronomac \n Weight: 0.350Kg \n Stage: aftermarket \n Light Color: Blue";
		catalog_view_ypr = new Ypr( 0.000, -0.750, 0.000 );

		value = tHUF2USD(70);
		brand_new_prestige_value = 25.0;
		
		tacho_num_regions = 2;
		tacho_value[0]	= 0.0;
		tacho_pos[0]	= 0.0;
		tacho_value[1]	= 1000.0;
		tacho_pos[1]	= 15.0;
		tacho_value[2]	= 10000.0;
		tacho_pos[2]	= 245.0;

       		addPart( parts.Tachometer_pack:0x0000001Cr, "pin" );
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

