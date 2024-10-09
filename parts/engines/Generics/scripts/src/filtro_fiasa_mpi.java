package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class filtro_fiasa_mpi extends EnginePart
{
	public filtro_fiasa_mpi( int id )
	{
		super( id );
		name = "Filtro Fiasa MPI";
		description = "";

		value = 150;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}
}
