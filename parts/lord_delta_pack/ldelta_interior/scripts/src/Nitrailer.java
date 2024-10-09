package java.game.parts.LDelta_Interior;

import java.game.parts.enginepart.canister.n2o.*;


public class Nitrailer extends LargeCanister
{
	public Nitrailer ( int id )
	{
		super( id );

		name = "Nitrous Trailer 687.0 pounds N2O canister";
		description = "This is nitrous ignorant oxide system made by Lord Delta Team.";

		value = tHUF2USD(158+2);
		brand_new_prestige_value = 90.0;

		capacity = 687.0/2.2;
		actual = capacity;

		police_check_fine_value	= 900.000;

	}
}

