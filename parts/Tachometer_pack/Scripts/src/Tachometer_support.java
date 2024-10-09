package java.game.parts;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;

public class Tachometer_support extends DecorativeBodyPart
{
	public Tachometer_support( int id )
	{
		super( id );
		name = "Cronomac support";
		description = " - ";
		catalog_view_ypr = new Ypr( 0.0, -0.85, 0.0 );

		value = tHUF2USD(22);
		brand_new_prestige_value = 45.0;
	}
}

