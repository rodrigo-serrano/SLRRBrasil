package java.game.parts.engines.OHC;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_Audi_Racing_7A extends Set
{
	public kit_Audi_Racing_7A( int id )
	{
		super( id );
		name = "Motor OHC 1.6 Turbo";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.OHC:0x00000052r ); // Shimutshibu_RC_B94S200_block
		inv.insertItem( parts.engines.OHC:0x00000044r ); // Shimutshibu_72er_crankshaft
		inv.insertItem( parts.engines.OHC:0x0000004Er ); // Shimutshibu_crankshaft_bearing_bridge
		inv.insertItem( parts.engines.OHC:0x00000049r ); // Shimutshibu_oil_pan
		inv.insertItem( parts.engines.OHC:0x00000056r ); // Shimutshibu_149er_connecting_rods
		inv.insertItem( parts.engines.OHC:0x00000057r ); // Shimutshibu_94er_LC_pistons
		inv.insertItem( parts.engines.OHC:0x0000004Dr ); // Shimutshibu_alternator
		inv.insertItem( parts.engines.OHC:0x0000000Ar ); // Baiern_Kraftwerk_2_5_flywheel
		inv.insertItem( parts.engines.OHC:0x00000043r ); // Baiern_Kraftwerk_clutch
		inv.insertItem( parts.engines.OHC:0x0000000Br ); // Shimutshibu_RC_T5600R1_transmission
		inv.insertItem( parts.engines.OHC:0x00000A42r ); // Shimutshibu_RC_DDSB8C_cylinder_head
		inv.insertItem( parts.engines.OHC:0x0000009Ar ); // Shimutshibu_exhaust_camshaft
		inv.insertItem( parts.engines.OHC:0x00000058r ); // Shimutshibu_camshaft_bearing_bridge
		inv.insertItem( parts.engines.OHC:0x00000A9Br ); // Shimutshibu_WRC_cylinder_head_cover
		inv.insertItem( parts.engines.OHC:0x00000047r ); // Shimutshibu_camshaft_drive_belt
		inv.insertItem( parts.engines.OHC:0x00000098r ); // Shimutshibu_RC_23W44EX_exhaust_header
		inv.insertItem( parts.engines.OHC:0x00000051r ); // Shimutshibu_RC_MWFCR22W12_turbocharger
        inv.insertItem( parts.engines.OHC:0x0000004Ar ); // Turbocharger_air_out_pipe
		inv.insertItem( parts.engines.OHC:0x00000092r ); // Turbocharger_exhaust_pipe
		inv.insertItem( parts.engines.OHC:0x00000097r ); // Shimutshibu_RC_HIB535T4_intake_manifold
		inv.insertItem( parts.engines.OHC:0x000000E2r ); // Shimutshibu_RC_IR4P4SI_fuel_rail
		inv.insertItem( parts.engines.OHC:0x00000090r );
		inv.insertItem( parts.engines.OHC:0x00000ABCr );
		inv.insertItem( parts.engines.OHC:0x0000004Cr );
		inv.insertItem( parts.engines.OHC:0x00000048r );
	}
}
