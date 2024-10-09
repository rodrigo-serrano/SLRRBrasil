package java.game.parts.engines.boxer_fusca;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class saida_turbina_direita_fusca extends ExhaustPipe
{
	public saida_turbina_direita_fusca( int id )
	{
		super( id );
		name = "Saida Turbina Direita Bi-turbo Para Tras VW a Ar";
		description = "";
		value = 250;
		setMaxWear(kmToMaxWear(500000.0));

		check4warnings();
	}
}
