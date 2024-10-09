package java.game.parts.wheels.rims;

import java.game.parts.rgearpart.reciprocatingrgearpart.*;

public class RODA_AE extends Wheel
{
	public RODA_AE ( int id )
	{
		name = "Roda Toyota Trueno 16x8";

		rim_type = rtFACTORY;
		SetupWheel( 16.0, 8.0, 20.0);
	}
}
