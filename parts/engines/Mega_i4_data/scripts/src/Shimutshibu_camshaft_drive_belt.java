package java.game.parts.engines.Mega_i4_data;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class Shimutshibu_camshaft_drive_belt extends Part
{
	public Shimutshibu_camshaft_drive_belt( int id )
	{
		super( id );
		name = "Powertech camshaft drive belt";
		description = "";

		value = tHUF2USD(2.5);
		brand_new_prestige_value = 5.12;
		setMaxWear(kmToMaxWear(18000.0));
	}
}
