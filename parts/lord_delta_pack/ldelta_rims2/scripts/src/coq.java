package java.game.parts.LDelta_Rims;

import java.game.parts.rgearpart.reciprocatingrgearpart.*;

public class coq extends Wheel
{
	public coq ( int id )
	{
		name = "Roda Fiat 147 Basic 14x5.5";
		brand_new_prestige_value = 30.00;

		value = tHUF2USD(29.000);
		rim_type = rtFACTORY;
		SetupWheel( 14.0, 5.5, 0.0);
	}
}
