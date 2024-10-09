package java.game.parts.engines.BF_161;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class tampa_original extends Part
{
	public tampa_original( int id )
	{
		super( id );
		name = "Tampa Valvula Willys BF-161";
		description = "";

		value = 70;
		brand_new_prestige_value = 76.64;
		setMaxWear(kmToMaxWear(1000000.0));

		check4warnings();
	}
}
