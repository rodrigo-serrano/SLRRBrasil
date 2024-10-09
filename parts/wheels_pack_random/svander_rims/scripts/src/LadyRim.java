package java.game.parts.svander_rims;

import java.game.parts.rgearpart.reciprocatingrgearpart.*;

public class LadyRim extends Wheel
{
	public LadyRim ( int id )
	{
		name = "Roda Fairlady Z-432 16x7.5";

		rim_type = rtFACTORY;
		SetupWheel( 16.0, 7.5, 20.0);
	}
}
