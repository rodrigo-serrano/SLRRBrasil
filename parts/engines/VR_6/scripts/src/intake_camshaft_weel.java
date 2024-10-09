package java.game.parts.engines.VR_6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;

public class intake_camshaft_weel extends EnginePart
{
	public intake_camshaft_weel( int id )
	{
		super( id );
		name = "Polia De Comando Admissao VW VR6";
		description = "";
		brand_new_prestige_value = 24.01;

		value = tHUF2USD(18);
		setMaxWear(kmToMaxWear(500000.0));

		check4warnings();
	}
}
