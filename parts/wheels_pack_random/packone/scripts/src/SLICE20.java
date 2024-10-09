package java.game.parts.wheels.rims;

import java.game.parts.rgearpart.reciprocatingrgearpart.*;

public class SLICE20 extends Wheel
{
	public SLICE20 ( int id )
	{
		name = "Roda SLICE 20x10.5";

		rim_type = rtFACTORY;
		SetupWheel( 20.0, 10.5, -30.0);
	}
}
