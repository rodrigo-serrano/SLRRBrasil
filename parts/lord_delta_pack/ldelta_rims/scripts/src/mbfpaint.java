package java.game.parts.LDelta_Rims;

import java.game.parts.rgearpart.reciprocatingrgearpart.*;

public class mbfpaint extends Wheel
{
	public mbfpaint( int id )
	{
		name = "Roda Mercedes Benz Dianteira Pintavel 22x7x5";
		brand_new_prestige_value = 60.00;

		value = tHUF2USD(140.000);
		rim_type = rtFACTORY;
		SetupWheel( 22.0, 7.5, -30.0);
	}
}
