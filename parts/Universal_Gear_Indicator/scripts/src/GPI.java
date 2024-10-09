package java.game.parts;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class GPI extends DecorativeBodyPart
{
	public GPI( int id )
	{
		super( id );
		name = "Digital Gear Indicator";
		description = "";
		catalog_view_ypr = new Ypr( 0.000, -0.750, 0.000 );

		value = 78;
		brand_new_prestige_value = 25.0;
		

       		addPart(parts.Universal_Gear_Indicator:0x00000029r,"pin");
		disableSlot(3,1); // tacho needle
	}

}

