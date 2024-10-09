package java.game.parts.engines.Boxer4;

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

public class radiator_diffuser extends EnginePart
{
	public radiator_diffuser( int id )
	{
		super( id );
		name = "Ventoinhas Radiador Subaru EJ";
		description = "";

		value = 110;
		brand_new_prestige_value = 25.55;
		setMaxWear(kmToMaxWear(18000.0));

		check4warnings();
	}
}
