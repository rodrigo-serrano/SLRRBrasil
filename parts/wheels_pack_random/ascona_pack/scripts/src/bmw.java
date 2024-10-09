package java.game.parts.wheels.rims;

import java.game.parts.rgearpart.reciprocatingrgearpart.*;

public class bmw extends Wheel
{
	public bmw ( int id )
	{
		name = "Roda Lenso Project-D 16x7.5";

		rim_type = rtFACTORY;
		SetupWheel( 16.0, 7.5, 20.0);
	}
}
