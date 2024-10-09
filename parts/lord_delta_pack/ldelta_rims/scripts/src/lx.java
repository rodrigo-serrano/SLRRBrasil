package java.game.parts.LDelta_Rims;

import java.game.parts.rgearpart.reciprocatingrgearpart.*;

public class lx extends Wheel
{
	public lx ( int id )
	{
		name = "Roda Autobianchi Y10 LX 14x5.5";
		brand_new_prestige_value = 65.00;

		value = tHUF2USD(40.000);

		rim_type = rtFACTORY;
		SetupWheel( 14.0, 5.5, 0.0);
	}
}
