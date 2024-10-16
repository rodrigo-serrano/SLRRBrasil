package java.game.parts.MegaPack_DragTiresG;

import java.game.parts.rgearpart.reciprocatingrgearpart.*;

public class tire_07 extends Gorgoil_Tyre
{
	public tire_07 ( int id )
	{
		tyre_size_label = "225/50 R15";
		
		render_types = new int[30];
		render_types[0]  = 0;		// for  3.0 inch wide rims //
		render_types[1]  = 0;		// for  3.5 inch wide rims //
		render_types[2]  = 0;		// for  4.0 inch wide rims //
		render_types[3]  = 0;		// for  4.5 inch wide rims //
		render_types[4]  = 0;		// for  5.0 inch wide rims //
		render_types[5]  = 0;		// for  5.5 inch wide rims //
		render_types[6]  = 0;		// for  6.0 inch wide rims //
		render_types[7]  = 0;		// for  6.5 inch wide rims //
		render_types[8]  = 0;		// for  7.0 inch wide rims //
		render_types[9]  = 0;		// for  7.5 inch wide rims //
		render_types[10] = parts.xtras_parts:0x17Cr; 		// for 8.0 inch wide rims //
		render_types[11] = parts.xtras_parts:0x17Cr;		// for 8.5 inch wide rims //
		render_types[12] = 0;		// for 9.0 inch wide rims //
		render_types[13] = 0;		// for 9.5 inch wide rims //
		render_types[14] = 0;		// for 10.0 inch wide rims //
		render_types[15] = 0;		// for 10.5 inch wide rims //
		render_types[16] = 0;		// for 11.0 inch wide rims //
		render_types[17] = 0;		// for 11.5 inch wide rims //
		render_types[18] = 0;		// for 12.0 inch wide rims //
		render_types[19] = 0;		// for 12.5 inch wide rims //
		render_types[20] = 0;		// for 13.0 inch wide rims //
		render_types[21] = 0;		// for 13.5 inch wide rims //
		render_types[22] = 0;		// for 14.0 inch wide rims //
		render_types[23] = 0;		// for 14.5 inch wide rims //
		render_types[24] = 0;		// for 15.0 inch wide rims //
		render_types[25] = 0;		// for 15.5 inch wide rims //
		render_types[26] = 0;		// for 16.0 inch wide rims //
		render_types[27] = 0;		// for 16.5 inch wide rims //
		render_types[28] = 0;		// for 17.0 inch wide rims //
		render_types[29] = parts.xtras_parts:0x17Cr;		// this rendertype as default //

		SetupTyre(225.0, 50.0, 15.0, 8.0, tcDRAGRADIAL, 2.0);

		name= "Hoosier Dot Drag Radial 225/50R15";
		
		calcStuffs();
	}
	
	public void calcStuffs()
	{
		for (minRimWidth_i=0; minRimWidth_i<29; minRimWidth_i++)
			if (render_types[minRimWidth_i])
			{
				minRimWidth = minRimWidth_i*0.5+3.0;
				break;
			}

		for (maxRimWidth_i=28; maxRimWidth_i>=0; maxRimWidth_i--)
			if (render_types[maxRimWidth_i])
			{
				maxRimWidth = maxRimWidth_i*0.5+3.0;
				break;
			}
		float R = wheel_radius*2.0/25.4;
		description = "This "+name+" is a "+Float.toString(tyre_width, "%1.0f mm wide ")+" tyre, that's diameter is "+Float.toString(R, "%1.0f inch at the rims and the height of its sidewalls is ")+Float.toString(profile_height, "%1.0f mm. ")+Float.toString(R, "It is compatible with all %1.0f inch rims ")+Float.toString(minRimWidth, "that are between %1.1f and ")+Float.toString(maxRimWidth, "%1.1f inch in width.");

		if (police_check_fine_value > 0.0)
			description = description + Float.toString(police_check_fine_value, " This tyre is not street legal! Police may fine you up to $%1.0f!");
	}
	public void updatevariables()
	{
		Wheel	rim = partOnSlot(1);

		if (rim)
		{
			int	render_type_index = clampTo((rim.rim_width-3)*2,0,25);

			if (render_types[render_type_index])
				setRenderType(render_types[render_type_index]);
			else
				setRenderType(render_types[29]);
			SetupTyre(225.0, 50.0, 15.0, rim.rim_width, tcDRAGRADIAL);
			super.updatevariables();
		}
	}
}
