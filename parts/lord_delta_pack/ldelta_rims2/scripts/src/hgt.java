package java.game.parts.LDelta_Rims;

import java.game.parts.rgearpart.reciprocatingrgearpart.*;

public class hgt extends Wheel
{
	public hgt ( int id )
	{
		name = "Roda Fiat Brava HGT 14x5.5";
		brand_new_prestige_value = 64.00;

		value = tHUF2USD(50.000);

		rim_type = rtFACTORY;
		SetupWheel( 14.0, 5.5, 0.0);
	}
}
