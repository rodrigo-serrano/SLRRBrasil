package java.game.parts.engines.boxer_fusca;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class saida_turbina_baixa extends ExhaustPipe
{
	public saida_turbina_baixa( int id )
	{
		super( id );
		name = "Saida Turbina 42/36";
		description = "";
		value = 50;
		setMaxWear(kmToMaxWear(500000.0));

		check4warnings();
	}
}
