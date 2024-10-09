package java.game.parts.LDelta_Rims;

import java.game.parts.rgearpart.reciprocatingrgearpart.*;

public class rim3 extends Wheel
{
	public rim3 ( int id )
	{
		name = "Roda Rim 1 14x5.5";
		brand_new_prestige_value = 40.00;

		value = tHUF2USD(40.000);
		rim_type = rtFACTORY;
		SetupWheel( 14.0, 5.5, 0.0);
	}
}
