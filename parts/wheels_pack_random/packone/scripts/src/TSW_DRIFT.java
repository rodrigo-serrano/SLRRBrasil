package java.game.parts.wheels.rims;

import java.game.parts.rgearpart.reciprocatingrgearpart.*;

public class TSW_DRIFT extends Wheel
{
	public TSW_DRIFT ( int id )
	{
		name = "Roda TSW DRIFT 20x10.5";

		rim_type = rtFACTORY;
		SetupWheel( 20.0, 10.5, -30.0);
	}
}
