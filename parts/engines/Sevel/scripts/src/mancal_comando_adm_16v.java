package java.game.parts.engines.Sevel;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class mancal_comando_adm_16v extends Part
{
	public mancal_comando_adm_16v( int id )
	{
		super( id );
		name = "Capela Comando Admissao Sevel 16v";
		description = "";

		value = 250;
		brand_new_prestige_value = 76.64;
		setMaxWear(kmToMaxWear(1000000.0));

		check4warnings();
	}
}
