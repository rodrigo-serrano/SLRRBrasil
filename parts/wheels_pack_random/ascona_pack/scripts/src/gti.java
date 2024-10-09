package java.game.parts.wheels.rims;

import java.game.parts.rgearpart.reciprocatingrgearpart.*;

public class gti extends Wheel
{
	public gti ( int id )
	{
		name = "Roda Schmidt 16x7.5";

		rim_type = rtFACTORY;
		SetupWheel( 16.0, 7.5, 20.0);
	}
}
