package java.game.parts.LDelta_Rims;

import java.game.parts.rgearpart.reciprocatingrgearpart.*;

public class miura extends Wheel
{
	public miura ( int id )
	{
		name = "Roda Miura Saga 14x5.5";
		brand_new_prestige_value = 64.00;

		value = tHUF2USD(64.000);
		rim_type = rtFACTORY;
		SetupWheel( 14.0, 5.5, 0.0);
	}
}
