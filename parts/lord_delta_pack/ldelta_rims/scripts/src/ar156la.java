package java.game.parts.LDelta_Rims;

import java.game.parts.rgearpart.reciprocatingrgearpart.*;

public class ar156la extends Wheel
{
	public ar156la ( int id )
	{
		name = "Roda Alfa Romeo 156 16x6";
		brand_new_prestige_value = 80.00;

		value = tHUF2USD(85.000);

		rim_type = rtFACTORY;
		SetupWheel( 16.0, 6.0, 20.0);
	}
}
