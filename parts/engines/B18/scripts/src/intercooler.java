package java.game.parts.engines.B18;

import java.util.*;
import java.util.resource.*;
import java.game.parts.enginepart.*;

public class intercooler extends AirCooler
{
	public intercooler( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Intercooler Honda Serie B";
		description = "";
		brand_new_prestige_value = 53.11;

		value = 400;
	}
}
