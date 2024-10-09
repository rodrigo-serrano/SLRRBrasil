package java.game.parts.engines.VR_6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;

public class vr_6_drive_belt extends EnginePart
{
	public vr_6_drive_belt( int id )
	{
		super( id );
		name = "Correia Auxiliar VW VR6";
		description = "";

		value = tHUF2USD(1.1);
		brand_new_prestige_value = 25.55;
		setMaxWear(kmToMaxWear(30000.0));

		check4warnings();
	}
}
