package java.game.parts.TGiroto_Subs;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;

public class injepro extends DecorativeBodyPart
{
	public injepro ( int id )
	{
		super( id );
		carCategory = COMMON;
		name = " injepro ";

		description = "";

		value = tHUF2USD(45);
		brand_new_prestige_value = 48.50;
		setMaxWear(kmToMaxWear(350000.0));
	}
}
