package java.game.parts.engines.boxer_fusca;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class plato_carga extends Clutch
{
	public plato_carga( int id )
	{
		super( id );
		name = "Embreagem Mola Dupla Motor Fusca";
		description = "";
		brand_new_prestige_value = 25;

		value = 500;
		setMaxWear(kmToMaxWear(46000.0));

		maxF = 980.0;// adjust clamping force of clutch
			
		maxRPM = 15000.0;

		inertia = kgToInertia(5.0);

		check4warnings();
	}
}