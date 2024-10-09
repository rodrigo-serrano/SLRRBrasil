package java.game.parts.LDelta_Rims;

import java.game.parts.rgearpart.reciprocatingrgearpart.*;

public class unosc extends Wheel
{
	public unosc ( int id )
	{
		name = "Roda Fiat Uno 1.5R e 1.6R 14x5.5";
		brand_new_prestige_value = 60.00;

		value = tHUF2USD(56.000);
		rim_type = rtFACTORY;
		SetupWheel( 14.0, 5.5, 0.0);
	}
}
