package java.game.parts.LDelta_Rims;

import java.game.parts.rgearpart.reciprocatingrgearpart.*;

public class tts extends Wheel
{
	public tts ( int id )
	{
		name = "Roda Fiat Tempra Turbo Stile 16x6";
		brand_new_prestige_value = 70.00;

		value = tHUF2USD(75.000);

		rim_type = rtFACTORY;
		SetupWheel( 16.0, 6.0, 20.0);
	}
}
