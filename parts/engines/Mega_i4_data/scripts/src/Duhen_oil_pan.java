package java.game.parts.engines.Mega_i4_data;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class Duhen_oil_pan extends OilPan
{
	public Duhen_oil_pan( int id )
	{
		super( id );
		name = "Duratec/Zetec/CHT oil pan";
		description = "";
		brand_new_prestige_value = 16.76;

		value = tHUF2USD(13);
		setMaxWear(kmToMaxWear(500000.0));

		friction_fwd = 0.0001;
		friction_rev = 0.0001;

		check4warnings();
	}
}
