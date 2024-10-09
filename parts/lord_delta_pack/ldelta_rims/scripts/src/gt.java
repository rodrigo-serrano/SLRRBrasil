package java.game.parts.LDelta_Rims;

import java.game.parts.rgearpart.reciprocatingrgearpart.*;

public class gt extends Wheel
{
	public gt ( int id )
	{
		name = "Roda Fiat Punto GT 14x5.5";
		brand_new_prestige_value = 60.00;

		value = tHUF2USD(40.000);

		rim_type = rtFACTORY;
		SetupWheel( 14.0, 5.5, 0.0);
	}
}
