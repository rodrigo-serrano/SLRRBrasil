package java.game.parts.engines.B18;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;

public class pipe_turbo_intercooler extends DecorativeBodyPart
{
	public pipe_turbo_intercooler( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Pressurizacao Turbo Para Intercooler Honda Serie B";
		description = "";

		value = 100;
		brand_new_prestige_value = 60.00;
	}
}
