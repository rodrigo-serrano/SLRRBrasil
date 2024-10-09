package java.game.parts.LDelta_Rims;

import java.game.parts.rgearpart.reciprocatingrgearpart.*;

public class tipoferr extends Wheel
{
	public tipoferr ( int id )
	{
		name = "Roda Fiat Tipo 14x5.5";
		brand_new_prestige_value = 40.00;

		value = tHUF2USD(30.000);

		rim_type = rtFACTORY;
		SetupWheel( 14.0, 5.5, 0.0);
	}
}
