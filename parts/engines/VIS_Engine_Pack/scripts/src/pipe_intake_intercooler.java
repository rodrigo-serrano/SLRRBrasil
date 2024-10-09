package java.game.parts.engines.VIS_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;

public class pipe_intake_intercooler extends DecorativeBodyPart
{
	public pipe_intake_intercooler( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Pressurizacao Coletor Para Intercooler Fiat V.I.S.";
		description = "";

		value = 150;
		brand_new_prestige_value = 60.00;
	}
}
