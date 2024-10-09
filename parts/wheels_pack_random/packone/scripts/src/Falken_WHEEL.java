package java.game.parts.wheels.rims;

import java.game.parts.rgearpart.reciprocatingrgearpart.*;

public class Falken_WHEEL extends Wheel
{
	public Falken_WHEEL ( int id )
	{
		name = "Roda Falken Mustang 16x8";

		rim_type = rtFACTORY;
		SetupWheel( 16.0, 8.0, 20.0);
	}
}
