package java.game.parts.LDelta_Rims;

import java.game.parts.rgearpart.reciprocatingrgearpart.*;

public class shock extends Wheel
{
	public shock ( int id )
	{
		name = "Roda Shock Five Spoke 14x5.5";

		rim_type = rtFACTORY;
		SetupWheel( 14.0, 5.5, 0.0);
	}
}
