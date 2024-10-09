package java.game.parts;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.cars.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.parts.bodypart.*;
import java.io.*;

public class defi_pin extends DecorativeBodyPart
{
	public defi_pin( int id )
	{
		super( id );
		name = "pin";
		description = " - ";

		value = tHUF2USD(1.0);
		brand_new_prestige_value = 1.0;
		setMaxWear(kmToMaxWear(500000.0));
	}
}

