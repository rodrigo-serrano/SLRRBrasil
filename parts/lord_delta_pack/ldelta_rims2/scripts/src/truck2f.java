package java.game.parts.LDelta_Rims;

import java.game.parts.rgearpart.reciprocatingrgearpart.*;

public class truck2f extends Wheel
{
	public truck2f( int id )
	{
		name = "Roda Fiat 190 Dianteira 22x7.5";
		brand_new_prestige_value = 100.00;

		value = tHUF2USD(160.000);
		rim_type = rtFACTORY;
		SetupWheel( 22.0, 7.5, -30.0);
	}
}
