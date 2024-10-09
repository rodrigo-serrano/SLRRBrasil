package java.game.parts.LDelta_Rims;

import java.game.parts.rgearpart.reciprocatingrgearpart.*;

public class spider extends Wheel
{
	public spider ( int id )
	{
		name = "Roda Alfa Romeo Spider 14x5.5";
		brand_new_prestige_value = 70.00;

		value = tHUF2USD(60.000);

		rim_type = rtFACTORY;
		SetupWheel( 14.0, 5.5, 0.0);
	}
}
