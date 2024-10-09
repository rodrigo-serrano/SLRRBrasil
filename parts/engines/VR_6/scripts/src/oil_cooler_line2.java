package java.game.parts.engines.VR_6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;

public class oil_cooler_line2 extends EnginePart
{
	public oil_cooler_line2( int id )
	{
		super( id );
		name = "Linha De Oleo Racing Para Radiador De Oleo VW VR6";
		description = "";

		value = tHUF2USD(15);
		brand_new_prestige_value = 16.00;
		setMaxWear(kmToMaxWear(1000000.0));

		check4warnings();
        }

	public String isDynoable()
	{
		Part p;

		p = partOnSlot( 7 );
		if (!p)
			return "A Linha De Oleo esta sem o Radiador De Oleo.";

		return super.isDynoable();
	}
}