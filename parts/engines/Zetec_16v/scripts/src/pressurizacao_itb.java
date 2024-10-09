package java.game.parts.engines.Zetec_16v;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;

public class pressurizacao_itb extends ExhaustPipe
{
	public pressurizacao_itb( int id )
	{
		super( id );
		name = "Pressurizacao Zetec 16v Com ITB";
		description = "";

		value = 370;
		brand_new_prestige_value = 60.00;
	}
}
