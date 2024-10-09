package java.game.parts.wheels.rims;

import java.game.parts.rgearpart.reciprocatingrgearpart.*;

public class spider extends Wheel
{
	public spider ( int id )
	{
		name = "Roda OldSchool 19x11";

		rim_type = rtFACTORY;
		SetupWheel( 19.0, 11.0, -25.0);
	}
}
