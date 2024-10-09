package java.game.parts.engines.VIS_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.parts.enginepart.*;

public class oil_radiator_5cyl extends AirCooler
{
	public oil_radiator_5cyl( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Radiador De Oleo Fiat V.I.S. 20v";
		description = "";
		brand_new_prestige_value = 53.11;

		value = 250;
	}
}
