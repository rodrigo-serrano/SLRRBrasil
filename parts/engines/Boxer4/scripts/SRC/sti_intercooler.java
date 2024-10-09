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

public class sti_intercooler extends Part
{
	public sti_intercooler( int id )
	{
		super( id );
		name = "Intercooler Subaru STI";
		description = "";

		value = 1000;
		brand_new_prestige_value = 25.55;
		setMaxWear(kmToMaxWear(18000.0));

		check4warnings();
	}
}
