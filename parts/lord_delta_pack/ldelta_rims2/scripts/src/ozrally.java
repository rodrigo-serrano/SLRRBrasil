package java.game.parts.LDelta_Rims;

import java.game.parts.rgearpart.reciprocatingrgearpart.*;

public class ozrally extends Wheel
{
	public ozrally ( int id )
	{
		name = "Roda OZ Racing rally 14x5.5";
		brand_new_prestige_value = 80.00;

		value = tHUF2USD(90.000);
		rim_type = rtFACTORY;
		SetupWheel( 14.0, 5.5, 0.0);
	}
}
