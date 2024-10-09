package java.game.parts.engines.CHT_Pack_Engine;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;

public class pipe_intake_intercooler extends ExhaustPipe
{
	public pipe_intake_intercooler( int id )
	{
		super( id );
		name = "tubulacao carburador para intercooler motor CHT";
		description = "";

		value = tHUF2USD(4.811);
		brand_new_prestige_value = 60.00;
	}
}
