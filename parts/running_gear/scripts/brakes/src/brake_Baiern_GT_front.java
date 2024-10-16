package java.game.parts.running_gear.brakes;

import java.game.parts.rgearpart.reciprocatingrgearpart.brake.*;

public class brake_Baiern_GT_front extends DiscBrake
{
	public brake_Baiern_GT_front( int id )
	{
		super( id );

		diam_mm			= 265.0;
		friction_disc		= RT_CARBON;
		friction_pad		= BP_BLACK_STUFF;
		number_of_calipers	= 2.0;
		force			= CL_FORCE_BRUTAL;

		name_prefix = "Baiern CoupeSport GT III";
		brand_prestige_factor = 4.00;
		calcStuffs();

		renderID_FL = parts:0x000000A1r;
		renderID_FR = parts:0x000000C1r;
		renderID_RL = parts:0x000000C3r;
		renderID_RR = parts:0x000000C5r;
	}
}
