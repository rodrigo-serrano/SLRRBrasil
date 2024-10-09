package java.game.parts.LDelta_Rims;

import java.game.parts.rgearpart.reciprocatingrgearpart.*;

public class eclipse extends Wheel
{
	public eclipse ( int id )
	{
		name = "Roda Mitsubishi Eclipse 16x6";
		brand_new_prestige_value = 50.00;

		value = tHUF2USD(79.000);
		rim_type = rtFACTORY;
		SetupWheel( 16.0, 6.0, 20.0);
	}
}
