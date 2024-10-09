package java.game.parts.LDelta_Rims;

import java.game.parts.rgearpart.reciprocatingrgearpart.*;

public class rust extends Wheel
{
	public rust ( int id )
	{
		name = "Roda Fiat 147 Enferrujada 14x5.5";
		brand_new_prestige_value = 10.00;

		value = tHUF2USD(20.000);
		rim_type = rtFACTORY;
		SetupWheel( 14.0, 5.5, 0.0);
	}
}
