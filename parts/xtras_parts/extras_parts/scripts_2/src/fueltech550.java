package java.game.parts.FT550;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;

public class fueltech550 extends DecorativeBodyPart
{
	public fueltech550 ( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Fueltech FT550";

		description = "Injeção Programavel Fueltech";

		value = tHUF2USD(500);
		brand_new_prestige_value = 80.50;
		setMaxWear(kmToMaxWear(550000.0));
	}
}
