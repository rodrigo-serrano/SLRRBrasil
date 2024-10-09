package java.game.parts.LDelta_Rims;

import java.game.parts.rgearpart.reciprocatingrgearpart.*;

public class ar166f extends Wheel
{
	public ar166f ( int id )
	{
		name = "Roda Alfa Romeo 166 16x6";
		brand_new_prestige_value = 100.00;

		value = tHUF2USD(95.000);

		rim_type = rtFACTORY;
		SetupWheel( 16.0, 6.0, 20.0);
	}
}
