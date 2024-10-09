package java.game.parts.LDelta_Rims;

import java.game.parts.rgearpart.reciprocatingrgearpart.*;

public class sprint extends Wheel
{
	public sprint ( int id )
	{
		name = "Roda Alfa Romeo Alfasud Sprint 14x5.5";
		brand_new_prestige_value = 72.00;

		value = tHUF2USD(58.000);

		rim_type = rtFACTORY;
		SetupWheel( 14.0, 5.5, 0.0);
	}
}
