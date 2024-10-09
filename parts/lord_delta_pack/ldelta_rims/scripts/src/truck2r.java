package java.game.parts.LDelta_Rims;

import java.game.parts.rgearpart.reciprocatingrgearpart.*;

public class truck2r extends Wheel
{
	public truck2r( int id )
	{
		name = "Roda Fiat 190 Traseira 22x7.5";
		brand_new_prestige_value = 100.00;

		value = tHUF2USD(150.000);
		rim_type = rtFACTORY;
		SetupWheel( 22.0, 7.5, -30.0);
	}
}
