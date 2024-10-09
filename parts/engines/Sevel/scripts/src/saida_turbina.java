package java.game.parts.engines.Sevel;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class saida_turbina extends ExhaustPipe
{
	public saida_turbina( int id )
	{
		super( id );
		name = "Saida Escape Turbo Apl 42/48.";
		description = "";
		value = 100;
		setMaxWear(kmToMaxWear(500000.0));

		check4warnings();
	}
}
