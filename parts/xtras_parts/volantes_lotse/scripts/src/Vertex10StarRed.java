package java.game.parts.interior;

import java.game.parts.bodypart.*;


public class Vertex10StarRed extends SteeringWheel
{
	public Vertex10StarRed( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Vertex 10 Star Red";
		description = "";

		value = tHUF2USD(55);
		brand_new_prestige_value = 100.00;

		setMaxWear(kmToMaxWear(500000.0));

	}
}
