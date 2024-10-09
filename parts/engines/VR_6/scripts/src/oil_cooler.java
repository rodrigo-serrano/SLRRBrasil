package java.game.parts.engines.VR_6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;

public class oil_cooler extends EnginePart
{
	public oil_cooler( int id )
	{
		super( id );
		name = "Adaptador Para Radiador De Oleo VW VR6";
		description = "";

		value = tHUF2USD(15);
		brand_new_prestige_value = 16.00;
		setMaxWear(kmToMaxWear(1000000.0));

		check4warnings();
        }

	public String isDynoable()
	{
		Part p;

		p = partOnSlot( 6 );
		if (!p)
			return "O Adaptador para radiador de oleo esta sem as Linhas De Oleo.";

		return super.isDynoable();
	}
}