package java.game.parts.LDelta_Rims;

import java.game.parts.rgearpart.reciprocatingrgearpart.*;

public class coupeg extends Wheel
{
	public coupeg ( int id )
	{
		name = "Roda Fiat Coupe 16x6";
		brand_new_prestige_value = 80.00;

		value = tHUF2USD(90.000);
		rim_type = rtFACTORY;
		SetupWheel( 16.0, 6.0, 20.0);
	}
}
