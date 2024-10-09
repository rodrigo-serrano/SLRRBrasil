package java.game.parts.MegaPack_DragTiresG;

import java.game.parts.rgearpart.reciprocatingrgearpart.*;

public class tire_64 extends Gorgoil_Tyre
{
	public tire_64 ( int id )
	{
		tyre_size_label = "330/65 R15";
		
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
		render_types[10] = 0; 		// for 8.0 inch wide rims //
		render_types[11] = 0;		// for 8.5 inch wide rims //
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
		render_types[24] = parts.extras_parts:0x1B5r;		// for 15.0 inch wide rims //
		render_types[25] = 0;		// for 15.5 inch wide rims //
		render_types[26] = 0;		// for 16.0 inch wide rims //
		render_types[27] = 0;		// for 16.5 inch wide rims //
		render_types[28] = 0;		// for 17.0 inch wide rims //
		render_types[29] = parts.extras_parts:0x1B5r;		// this rendertype as default //

		SetupTyre(330.0, 65.0, 15.0, 15.0, tcSLICK, 2.0);

		name= "Hoosier 34x15x15 slick";
		
		name_prefix = "Hoosier";
		calcStuffs();
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
			SetupTyre(380.0, 65.0, 15.0, rim.rim_width, tcSLICK);
			super.updatevariables();
		}
	}
}
