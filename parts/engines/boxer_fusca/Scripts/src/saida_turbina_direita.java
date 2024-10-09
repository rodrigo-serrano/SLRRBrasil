package java.game.parts.engines.boxer_fusca;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class saida_turbina_direita extends ExhaustPipe
{
	public saida_turbina_direita( int id )
	{
		super( id );
		name = "Saida Turbina Direita Bi-turbo VW a Ar";
		description = "";
		value = 100;
		setMaxWear(kmToMaxWear(500000.0));

		check4warnings();
	}
}
