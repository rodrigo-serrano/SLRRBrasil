package java.game.parts.running_gear.brakes;

import java.game.parts.rgearpart.reciprocatingrgearpart.brake.*;

public class brake_SuperDuty_500_front extends DiscBrake
{
	public brake_SuperDuty_500_front( int id )
	{
		super( id );

		diam_mm			= 335.0;
		friction_disc		= RT_VENTEDGROOVED;
		friction_pad		= BP_GREEN_STUFF;
		number_of_calipers	= 3.0;
		force			= CL_FORCE_1;

		name_prefix = "Hauler's SuperDuty 500";
		brand_prestige_factor = 1.55;
		calcStuffs();

		renderID_FL = parts:0x000000A1r;
		renderID_FR = parts:0x000000C1r;
		renderID_RL = parts:0x000000C3r;
		renderID_RR = parts:0x000000C5r;
	}
}
