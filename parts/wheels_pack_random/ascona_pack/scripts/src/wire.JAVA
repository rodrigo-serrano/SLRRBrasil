package java.game.parts.wheels.rims;

import java.game.parts.rgearpart.reciprocatingrgearpart.*;

public class wire extends Wheel
{
	public wire ( int id )
	{
		name = "Roda Lenso Project-D 19x11";

		rim_type = rtFACTORY;
		SetupWheel( 19.0, 11.0, -25.0);
	}
}
