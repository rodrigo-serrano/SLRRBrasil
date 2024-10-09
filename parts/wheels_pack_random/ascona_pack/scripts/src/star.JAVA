package java.game.parts.wheels.rims;

import java.game.parts.rgearpart.reciprocatingrgearpart.*;

public class star extends Wheel
{
	public star ( int id )
	{
		name = "Roda Black Racing 19x11";

		rim_type = rtFACTORY;
		SetupWheel( 19.0, 11.0, -25.0);
	}
}
