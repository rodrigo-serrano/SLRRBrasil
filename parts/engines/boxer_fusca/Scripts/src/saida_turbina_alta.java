package java.game.parts.engines.boxer_fusca;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class saida_turbina_alta extends ExhaustPipe
{
	public saida_turbina_alta( int id )
	{
		super( id );
		name = "Saida Turbina 50/48";
		description = "";
		value = tHUF2USD(8);
		setMaxWear(kmToMaxWear(500000.0));

		check4warnings();
	}
}
