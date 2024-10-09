package java.game.parts;

import java.game.parts.bodypart.*;


public class Bride_Zeta_full_BLACK extends FrontSeat
{
	public Bride_Zeta_full_BLACK( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Bride Zeta III Full Black";
		description = "";

		value = tHUF2USD(300);
		brand_new_prestige_value = 300.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
