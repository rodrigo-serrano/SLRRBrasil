package java.game.parts.LDelta_Rims;

import java.game.parts.rgearpart.reciprocatingrgearpart.*;

public class estepe14 extends Wheel
{
	public estepe14 ( int id )
	{
		name = "Roda De Estepe 14x5";
		brand_new_prestige_value = 30.00;

		value = tHUF2USD(21.000);
		rim_type = rtFACTORY;
		SetupWheel( 14.0, 5.0, 0.0);
	}
}
