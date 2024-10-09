package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class pressu_f1_efi extends EnginePart
{
	public pressu_f1_efi( int id )
	{
		super( id );
		name = "Pressurizacao GM Familia 1 8v EFI";
		description = "";

		value = 350;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}
}
