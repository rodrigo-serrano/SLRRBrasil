package java.game.parts.LDelta_Rims;

import java.game.parts.rgearpart.reciprocatingrgearpart.*;

public class ts extends Wheel
{
	public ts ( int id )
	{
		name = "Roda Fiat Tempra Stile 14x5.5";
		brand_new_prestige_value = 65.00;

		value = tHUF2USD(42.000);

		rim_type = rtFACTORY;
		SetupWheel( 14.0, 5.5, 0.0);
	}
}
