package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class fitti extends SteeringWheel
{
	public fitti( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Fiat 147 Fittipaldi steering wheel";
		description = "Steering wheel from 147 Fittipaldi.";

		value = tHUF2USD(46);
		brand_new_prestige_value = 51.00;

		setMaxWear(kmToMaxWear(500000.0));

		diameter = 380.0;
		hub_depth = 5.0;
	}
}
