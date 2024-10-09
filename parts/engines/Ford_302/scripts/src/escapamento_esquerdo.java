package java.game.parts.engines.Ford_302;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class escapamento_esquerdo extends ExhaustHeader
{
	public escapamento_esquerdo( int id )
	{
		super( id );
		name = "Coletor Escape Lado Esquerdo Ford 302";
		description = "";

		value = 600;
		brand_new_prestige_value = 153.28;
		setMaxWear(kmToMaxWear(330000.0));

		efficiency = 1.00;

		check4warnings();
	}
}
