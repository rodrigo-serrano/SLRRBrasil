package java.game.parts.engines.VR_6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;

public class intake_manifold_underpart extends EnginePart
{
	public intake_manifold_underpart( int id )
	{
		super( id );
		name = "Pe Coletor De Admissao VW VR6";
		description = " ";

		value = tHUF2USD(18);
		brand_new_prestige_value = 51.09;
		setMaxWear(kmToMaxWear(500000.0));

		check4warnings();
        }

	public String isDynoable()
	{
		Part p;

		p = partOnSlot( 32 );
		if (!p)
			return "O Coletor De Admissao nao tem Parafusos.";
 
                p = partOnSlot( 33 );
		if (!p)
			return "O Coletor De Admissao nao tem Parafusos.";

		return super.isDynoable();
	}
}
