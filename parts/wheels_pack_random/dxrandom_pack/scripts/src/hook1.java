package java.game.parts.TGiroto_Subs;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;

public class hook1 extends DecorativeBodyPart
{
	public hook1 ( int id )
	{
		super( id );
		carCategory = COMMON;
		name = " tow hook 1 ";

		description = "";

		value = tHUF2USD(45);
		brand_new_prestige_value = 48.50;
		setMaxWear(kmToMaxWear(350000.0));
	}
}
