package java.game.parts.TGiroto_Subs;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;

public class setabl extends DecorativeBodyPart
{
	public setabl ( int id )
	{
		super( id );
		carCategory = COMMON;
		name = " seta preta ";

		description = "";

		value = tHUF2USD(45);
		brand_new_prestige_value = 48.50;
		setMaxWear(kmToMaxWear(350000.0));
	}
}
