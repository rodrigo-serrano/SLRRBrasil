package java.game.parts.LDelta_Rims;

import java.game.parts.rgearpart.reciprocatingrgearpart.*;

public class marea extends Wheel
{
	public marea ( int id )
	{
		name = "Roda Fiat Marea 16x6";
		brand_new_prestige_value = 65.00;

		value = tHUF2USD(80.000);
		rim_type = rtFACTORY;
		SetupWheel( 16.0, 6.0, 20.0);
	}
}
