package java.game.parts.wheels.rims;

import java.game.parts.rgearpart.reciprocatingrgearpart.*;

public class rusty_steelie extends Wheel
{
	public rusty_steelie ( int id )
	{
		name = "Roda Schmidt 15x9.5";

		rim_type = rtFACTORY;
		SetupWheel( 15.0, 9.5, -45.0);
	}
}
