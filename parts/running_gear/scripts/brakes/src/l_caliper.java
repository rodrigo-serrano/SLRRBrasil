package java.game.parts.running_gear.brakes;

import java.render.osd.*;
import java.util.*;
import java.util.resource.*;
import java.game.parts.*;

public class l_caliper extends Part
{
	public l_caliper( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Universal Caliper";
		description = "Paintable";
		brand_new_prestige_value = 42.49;

		value = tHUF2USD(35.579);

	}
}
