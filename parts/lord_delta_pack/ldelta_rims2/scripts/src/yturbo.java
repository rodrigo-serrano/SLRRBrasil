package java.game.parts.LDelta_Rims;

import java.game.parts.rgearpart.reciprocatingrgearpart.*;

public class yturbo extends Wheel
{
	public yturbo ( int id )
	{
		name = "Roda Autobianchi Y10 Turbo 14x5.5";
		brand_new_prestige_value = 67.00;

		value = tHUF2USD(40.000);

		rim_type = rtFACTORY;
		SetupWheel( 14.0, 5.5, 0.0);
	}
}
