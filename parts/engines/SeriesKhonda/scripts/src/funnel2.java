package java.game.parts.engines.SeriesKhonda;

import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;
import java.game.cars.*;

public class funnel2 extends IntakeManifold
{
	public funnel2( int id )
	{
		super( id );
		name = "Ram Scoop Alternativo Honda Serie K";
		description = "";
		brand_new_prestige_value = 43.01;

		value = 181.81;
		brand_new_prestige_value = 25.55;
		setMaxWear(kmToMaxWear(18000.0));

		check4warnings();
	}
}

	
