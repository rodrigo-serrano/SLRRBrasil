package java.game.parts.engines.VIS_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.parts.enginepart.*;

public class intercooler extends AirCooler
{
	public intercooler( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Intercooler Original Fiat V.I.S.";
		description = "";
		brand_new_prestige_value = 53.11;

		value = 350;
	}
}
