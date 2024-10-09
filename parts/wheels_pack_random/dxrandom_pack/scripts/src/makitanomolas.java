package java.game.parts.TGiroto_Subs;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;

public class makitanomolas extends DecorativeBodyPart
{
	public makitanomolas ( int id )
	{
		super( id );
		carCategory = COMMON;
		name = " makita serra mola chora boy ";

		description = "";

		value = tHUF2USD(45);
		brand_new_prestige_value = 48.50;
		setMaxWear(kmToMaxWear(350000.0));
	}
}
