package java.game.parts.engines.VIS_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.parts.enginepart.*;

public class radiator_4cyl extends AirCooler
{
	public radiator_4cyl( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Radiador Fiat V.I.S. 16v";
		description = "";
		brand_new_prestige_value = 53.11;

		value = 300;
	}
}
