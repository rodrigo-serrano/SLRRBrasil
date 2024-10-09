package java.game.parts.engines.VR_6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;

public class intake_manifold_pipe2 extends EnginePart
{
	public intake_manifold_pipe2( int id )
	{
		super( id );
		name = "Pressurizacao Angulada Coletor Para Intercooler VW VR6";
		description = "";

		value = tHUF2USD(15);
		brand_new_prestige_value = 16.00;
		setMaxWear(kmToMaxWear(1000000.0));

		check4warnings();
	}
}
