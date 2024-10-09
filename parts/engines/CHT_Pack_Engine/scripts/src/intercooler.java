package java.game.parts.engines.CHT_Pack_Engine;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;

public class intercooler extends AirCooler
{
	public intercooler( int id )
	{
		super( id );
		name = "Intercooler CHT";
		description = "";
		brand_new_prestige_value = 53.11;

		value = tHUF2USD(57.740);
	}
}
