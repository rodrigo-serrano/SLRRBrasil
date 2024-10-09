package java.game.parts.engines.Boxer4;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class turbo_L_pipes extends Part
{
	public turbo_L_pipes( int id )
	{
		super( id );
		name = "Escapamento Turbina Esquerda Subaru EJ";
		description = "";

		value = 350;
		brand_new_prestige_value = 25.55;
		setMaxWear(kmToMaxWear(18000.0));

		check4warnings();
	}
}
