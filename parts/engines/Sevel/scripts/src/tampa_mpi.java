package java.game.parts.engines.Sevel;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class tampa_mpi extends Part
{
	public tampa_mpi( int id )
	{
		super( id );
		name = "Tampa Cabecote Fiat Sevel MPI";
		description = "";

		value = 300;
		brand_new_prestige_value = 76.64;
		setMaxWear(kmToMaxWear(1000000.0));

		check4warnings();
	}
}
