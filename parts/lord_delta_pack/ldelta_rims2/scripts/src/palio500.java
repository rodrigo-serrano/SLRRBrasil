package java.game.parts.LDelta_Rims;

import java.game.parts.rgearpart.reciprocatingrgearpart.*;

public class palio500 extends Wheel
{
	public palio500 ( int id )
	{
		name = "Roda Fiat Palio 500 anos 16x6";
		brand_new_prestige_value = 70.00;

		value = tHUF2USD(67.000);
		rim_type = rtFACTORY;
		SetupWheel( 16.0, 6.0, 20.0);
	}
}
