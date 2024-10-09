package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class volt extends DecorativeBodyPart
{
	public volt( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Voltmeter Gauge without support";
		description = "From VDO.";

		value = tHUF2USD(19);
		brand_new_prestige_value = 23.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
