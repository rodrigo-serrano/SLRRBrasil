package java.game.parts.engines.OHC;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;

public class pipe_intake_intercooler extends DecorativeBodyPart
{
	public pipe_intake_intercooler( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "OHC intake to intercooler pipe";
		description = "";

		value = tHUF2USD(4.811);
		brand_new_prestige_value = 60.00;
	}
}
