package java.game.parts.interior;

import java.game.parts.bodypart.*;


public class MoMo_MonteCarlo_SPOON extends SteeringWheel
{
	public MoMo_MonteCarlo_SPOON( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "MoMo MonteCarlo SPOON";
		description = "";

		value = tHUF2USD(55);
		brand_new_prestige_value = 100.00;

		setMaxWear(kmToMaxWear(500000.0));

	}
}
