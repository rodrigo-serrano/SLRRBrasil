package java.game.parts.LDelta_Rims;

import java.game.parts.rgearpart.reciprocatingrgearpart.*;

public class mbr extends Wheel
{
	public mbr( int id )
	{
		name = "Roda Mercedes Benz Traseira 22x7.5";
		brand_new_prestige_value = 60.00;

		value = tHUF2USD(110.000);
		rim_type = rtFACTORY;
		SetupWheel( 22.0, 7.5, -30.0);
	}
}
