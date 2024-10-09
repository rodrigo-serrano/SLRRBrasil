package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class cc_engines_turbocharger_exhaust_pipe extends ExhaustPipe
{
	public cc_engines_turbocharger_exhaust_pipe( int id )
	{
		super( id );
		name = "IDH High Flow Pod-Filter";
		description = "";
		value = tHUF2USD(8);

		brand_new_prestige_value = 45.00;
		setMaxWear(kmToMaxWear(500000.0));

		mufflerSlotIDList = new Vector();
		mufflerSlotIDList.addElement( new Integer(2) );
	}
}
