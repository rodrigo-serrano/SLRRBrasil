package java.game.parts.bodypart;

import java.io.*;
import java.util.*;
import java.util.resource.*;
import java.render.osd.*;
import java.game.*;
import java.game.cars.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.rgearpart.*;
import java.game.parts.rgearpart.reciprocatingrgearpart.*;

public class RearDoor extends BodyPart
{
	public RearDoor( int id )
	{
		super( id );

		name = "Porta Traseira";

		prestige_calc_weight = 15.0;
		drag_reduction = 0.025;
	}
}

