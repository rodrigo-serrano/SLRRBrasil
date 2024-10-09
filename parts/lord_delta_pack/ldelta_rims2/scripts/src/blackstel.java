package java.game.parts.LDelta_Rims;

import java.game.parts.rgearpart.reciprocatingrgearpart.*;

public class blackstel extends Wheel
{
	public blackstel ( int id )
	{
		name = "Roda Fiat 147 14x5.5";
		brand_new_prestige_value = 20.00;

		value = tHUF2USD(24.000);
		rim_type = rtFACTORY;
		SetupWheel( 14.0, 5.5, 0.0);
	}
}
