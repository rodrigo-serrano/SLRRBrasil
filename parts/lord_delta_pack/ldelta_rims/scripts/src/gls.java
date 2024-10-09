package java.game.parts.LDelta_Rims;

import java.game.parts.rgearpart.reciprocatingrgearpart.*;

public class gls extends Wheel
{
	public gls ( int id )
	{
		name = "Roda Fiat 147 GLS 14x5.5";
		brand_new_prestige_value = 50.00;

		value = tHUF2USD(50.000);
		rim_type = rtFACTORY;
		SetupWheel( 14.0, 5.5, 0.0);
	}
}
