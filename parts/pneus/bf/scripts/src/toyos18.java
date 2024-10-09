package java.game.parts.bf;

import java.game.parts.rgearpart.reciprocatingrgearpart.*;

public class toyos18 extends Tyre
{
	public toyos18( int id )
	{
		tyre_size_label = "245/25 R18";

		render_types[0]  = 0;		// for  5.0 inch wide rims //
		render_types[1]  = 0;		// for  5.5 inch wide rims //
		render_types[2]  = 0;		// for  6.0 inch wide rims //
		render_types[3]  = parts.pneus:0x16Er;	// for  6.5 inch wide rims //
		render_types[4]  = parts.pneus:0x16Er;	// for  7.0 inch wide rims //
		render_types[5]  = parts.pneus:0x16Er;	// for  7.5 inch wide rims //
		render_types[6]  = parts.pneus:0x16Er;	// for  8.0 inch wide rims //
		render_types[7]  = parts.pneus:0x16Er;	// for  8.5 inch wide rims //
		render_types[8]  = parts.pneus:0x16Er;	// for  9.0 inch wide rims //
		render_types[9]  = parts.pneus:0x16Er;	// for  9.5 inch wide rims //
		render_types[10] = parts.pneus:0x16Er;	// for 10.0 inch wide rims //
		render_types[11] = parts.pneus:0x16Er;	// for 10.5 inch wide rims //
		render_types[12] = parts.pneus:0x16Er;	// for 11.0 inch wide rims //
		render_types[13] = parts.pneus:0x16Er;	// for 11.5 inch wide rims //
		render_types[14] = parts.pneus:0x16Er;	// for 12.0 inch wide rims //
		render_types[15] = parts.pneus:0x16Er;	// for 12.5 inch wide rims //
		render_types[16] = 0;		// for 13.0 inch wide rims //
		render_types[17] = 0;		// for 13.5 inch wide rims //
		render_types[18] = 0;		// for 14.0 inch wide rims //
		render_types[19] = 0;		// for 14.5 inch wide rims //
		render_types[20] = 0;		// for 15.0 inch wide rims //
		render_types[21] = parts.pneus:0x16Er;	// this rendertype as default //

		SetupTyre(255.0, 14.0, 18.0, 11.0, tcSUPERSPORT, 2.0);

		calcStuffs();

		name = "Toyo R888 Streched 245/55 R18";
		value = 600.0;
	}

	public void updatevariables()
	{
		Wheel	rim = partOnSlot(1);

		if (rim)
		{
			int	render_type_index = clampTo((rim.rim_width-5)*2,0,20);

			if (render_types[render_type_index])
				setRenderType(render_types[render_type_index]);
			else
				setRenderType(render_types[21]);
			SetupTyre(255.0, 14.0, 18.0, rim.rim_width, tcSUPERSPORT);
			super.updatevariables();
		}
	}
}
