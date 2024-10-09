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

public class Trunk extends BodyPart
{
	public Trunk( int id )
	{
		super( id );

		name = "Tampa Traseira";

		prestige_calc_weight = 20.0;
		drag_reduction = 0.03;
	}
}

