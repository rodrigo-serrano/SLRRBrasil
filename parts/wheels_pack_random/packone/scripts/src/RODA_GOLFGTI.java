package java.game.parts.wheels.rims;

import java.game.parts.rgearpart.reciprocatingrgearpart.*;

public class RODA_GOLFGTI extends Wheel
{
	public RODA_GOLFGTI ( int id )
	{
		name = "Roda Golf GTI 16x8";

		rim_type = rtFACTORY;
		SetupWheel( 16.0, 8.0, 20.0);
	}
}
