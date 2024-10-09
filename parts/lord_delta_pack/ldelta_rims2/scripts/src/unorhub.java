package java.game.parts.LDelta_Rims;

import java.game.parts.rgearpart.reciprocatingrgearpart.*;

public class unorhub extends Wheel
{
	public unorhub ( int id )
	{
		name = "Roda Fiat Uno 1.5R 14x5.5";
		brand_new_prestige_value = 70.00;

		value = tHUF2USD(70.000);
		rim_type = rtFACTORY;
		SetupWheel( 14.0, 5.5, 0.0);
	}
}
