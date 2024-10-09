package java.game.parts.LDelta_Rims;

import java.game.parts.rgearpart.reciprocatingrgearpart.*;

public class gota extends Wheel
{
	public gota ( int id )
	{
		name = "Roda Fiat Marea 16x6";
		brand_new_prestige_value = 70.00;

		value = tHUF2USD(85.000);
		rim_type = rtFACTORY;
		SetupWheel( 16.0, 6.0, 20.0);
	}
}
