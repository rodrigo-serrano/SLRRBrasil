package java.game.parts.LDelta_Rims;

import java.game.parts.rgearpart.reciprocatingrgearpart.*;

public class dacon extends Wheel
{
	public dacon ( int id )
	{
		name = "Roda Jolly Lemans 14x5.5";
		brand_new_prestige_value = 70.00;

		value = tHUF2USD(72.000);
		rim_type = rtFACTORY;
		SetupWheel( 14.0, 5.5, 0.0);
	}
}
