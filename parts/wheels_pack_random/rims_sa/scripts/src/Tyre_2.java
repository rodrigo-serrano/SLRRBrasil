package java.game.parts.Rims_SA;

import java.game.parts.rgearpart.reciprocatingrgearpart.*;

public class Tyre_2 extends Tyre
{
	public Tyre_2 ( int id )
	{
		tyre_size_label = "ADVAN NEOVA 18 x 11.0 Perfil Baixo";

		render_types[0]  = 0;		// for  5.0 inch wide rims //
		render_types[1]  = 0;		// for  5.5 inch wide rims //
		render_types[2]  = 0;		// for  6.0 inch wide rims //
		render_types[3]  = 0;		// for  6.5 inch wide rims //
		render_types[4]  = 0;		// for  7.0 inch wide rims //
		render_types[5]  = 0;		// for  7.5 inch wide rims //
		render_types[6]  = 0;		// for  8.0 inch wide rims //
		render_types[7]  = 0;		// for  8.5 inch wide rims //
		render_types[7]  = 0;		// for  9.0 inch wide rims //
		render_types[9]  = 0;		// for  9.5 inch wide rims //
		render_types[10] = 0;		// for 10.0 inch wide rims //
		render_types[11] = 0;		// for 10.5 inch wide rims //
		render_types[12]  = parts.wheels_pack_random:0x4FCr;		// for 11.0 inch wide rims //
		render_types[13] = 0;		// for 11.5 inch wide rims //
		render_types[14] = 0;		// for 12.0 inch wide rims //
		render_types[15] = 0;		// for 12.5 inch wide rims //
		render_types[16] = 0;		// for 13.0 inch wide rims //
		render_types[17] = 0;		// for 13.5 inch wide rims //
		render_types[18] = 0;		// for 14.0 inch wide rims //
		render_types[19] = 0;		// for 14.5 inch wide rims //
		render_types[20] = 0;		// for 15.0 inch wide rims //
		render_types[21] = parts.wheels_pack_random:0x4FCr;	// this rendertype as default //

		SetupTyre(165.0, 30.0, 18.0, 11.0, tcSPORT, 2.0);

		calcStuffs();
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
			SetupTyre(165.0, 30.0, 18.0, rim.rim_width, tcSPORT);
			super.updatevariables();
		}
	}
}
