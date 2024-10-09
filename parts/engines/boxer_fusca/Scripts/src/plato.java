package java.game.parts.engines.boxer_fusca;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class plato extends Clutch
{
	public plato( int id )
	{
		super( id );
		name = "Embreagem Original Motor Fusca";
		description = "";
		brand_new_prestige_value = 25;

		value = 300;
		setMaxWear(kmToMaxWear(46000.0));

		maxF = 300.0;// adjust clamping force of clutch
			
		maxRPM = 10000.0;

		inertia = kgToInertia(6.5);

		check4warnings();
	}
}