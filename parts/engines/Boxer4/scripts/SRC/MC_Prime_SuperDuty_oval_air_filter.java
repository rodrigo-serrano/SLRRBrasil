package java.game.parts.engines.Boxer4;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class MC_Prime_SuperDuty_oval_air_filter extends Part
{
	public MC_Prime_SuperDuty_oval_air_filter( int id )
	{
		super( id );
		name = "Filtro Turbina Esquerda Subaru EJ";
		description = "";

		value = 150;
		brand_new_prestige_value = 25.55;
		setMaxWear(kmToMaxWear(18000.0));

		check4warnings();
	}
}
