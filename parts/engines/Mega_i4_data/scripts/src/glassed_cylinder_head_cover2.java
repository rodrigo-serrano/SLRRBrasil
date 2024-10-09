package java.game.parts.engines.Mega_i4_data;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class glassed_cylinder_head_cover2 extends Part
{
	public glassed_cylinder_head_cover2( int id )
	{
		super( id );
		name = "i4 Glassed cylinder head cover2";
		description = "For tunned engines";

		value = tHUF2USD(37.5);
		brand_new_prestige_value = 59.00;
		setMaxWear(kmToMaxWear(1000000.0));
	}
//	public String isDynoable()
//	{
//		Part p;
//
//		p = partOnSlot( 991 );
//		if (!p)
//			return "The engine cover missing Locking cover";
//
//		return super.isDynoable();
//	}
}
