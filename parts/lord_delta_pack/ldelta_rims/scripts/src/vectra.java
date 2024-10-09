package java.game.parts.LDelta_Rims;

import java.game.parts.rgearpart.reciprocatingrgearpart.*;

public class vectra extends Wheel
{
	public vectra ( int id )
	{
		name = "Roda Opel Vectra 14x5.5";
		brand_new_prestige_value = 60.00;

		value = tHUF2USD(48.000);

		rim_type = rtFACTORY;
		SetupWheel( 14.0, 5.5, 0.0);
	}
}
