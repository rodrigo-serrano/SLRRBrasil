package java.game.parts.LDelta_Rims;

import java.game.parts.rgearpart.reciprocatingrgearpart.*;

public class fiatmturbo extends Wheel
{
	public fiatmturbo ( int id )
	{
		name = "Roda Fiat Marea Turbo 14x5.5";
		brand_new_prestige_value = 65.00;

		value = tHUF2USD(70.000);
		rim_type = rtFACTORY;
		SetupWheel( 14.0, 5.5, 0.0);
	}
}
