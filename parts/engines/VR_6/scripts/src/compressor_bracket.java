package java.game.parts.engines.VR_6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;

public class compressor_bracket extends EnginePart
{
	public compressor_bracket( int id )
	{
		super( id );
		name = "Suporte Supercharger VW VR6";
		description = "";

		value = tHUF2USD(1.1);
		brand_new_prestige_value = 25.55;
		setMaxWear(kmToMaxWear(30000.0));

		check4warnings();
	}
}
