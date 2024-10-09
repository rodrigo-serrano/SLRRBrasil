package java.game.parts.wheels.rims;

import java.game.parts.rgearpart.reciprocatingrgearpart.*;

public class rolls extends Wheel
{
	public rolls ( int id )
	{
		name = "Roda Old Steel Rim 16x7.5";

		rim_type = rtFACTORY;
		SetupWheel( 16.0, 7.5, 20.0);
	}
}
