package java.game.parts.engines.VR_6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_vr_6_29 extends Set
{
	public kit_vr_6_29( int id )
	{
		super( id );
		name = "Kit Motor VR6 2.9";
		description = "";
	}

	public void build( Inventory inv )
	{
	        inv.insertItem( parts.engines.vr_6:0x0000007Er ); // block
                inv.insertItem( parts.engines.vr_6:0x0000004Er ); // crankshaft_bearing_bridge
                inv.insertItem( parts.engines.vr_6:0x0000a684r ); // crankshaft_bearing_bridge_nut
                inv.insertItem( parts.engines.vr_6:0x0000007Dr ); // crankshaft
                inv.insertItem( parts.engines.vr_6:0x00000094r ); // connecting_rods
                inv.insertItem( parts.engines.vr_6:0x00000045r ); // flywheel
		inv.insertItem( parts.engines.vr_6:0x00000043r ); // clutch
                inv.insertItem( parts.engines.vr_6:0x0000a484r ); // connecting_rods_underpart
                inv.insertItem( parts.engines.vr_6:0x0000a584r ); // connecting_rods_screw
                inv.insertItem( parts.engines.vr_6:0x00000095r ); // pistons
                inv.insertItem( parts.engines.vr_6:0x00000049r ); // oil_pan
                inv.insertItem( parts.engines.vr_6:0x0000a784r ); // oil_pan_gasket
                inv.insertItem( parts.engines.vr_6:0x0000a884r ); // oil_pan_screw
		inv.insertItem( parts.engines.vr_6:0x0000004Dr ); // alternator
                inv.insertItem( parts.engines.vr_6:0x0000b384r ); // sprocket
                inv.insertItem( parts.engines.vr_6:0x0000b684r ); // lower_timing
                inv.insertItem( parts.engines.vr_6:0x0000b784r ); // lower_timing_screw
                inv.insertItem( parts.engines.vr_6:0x0000d184r ); // oil_filters
                inv.insertItem( parts.engines.vr_6:0x0000d284r ); // waterpump
                inv.insertItem( parts.engines.vr_6:0x0000d384r ); // pump
                inv.insertItem( parts.engines.vr_6:0x0000d584r ); // poly
                inv.insertItem( parts.engines.vr_6:0x0000e484r ); // thermostat_housing
		inv.insertItem( parts.engines.vr_6:0x00000083r ); // transmission
                inv.insertItem( parts.engines.vr_6:0x0000a084r ); // head_gasket
		inv.insertItem( parts.engines.vr_6:0x00000081r ); // cylinder_head
                inv.insertItem( parts.engines.vr_6:0x0000a184r ); // block_nut
                inv.insertItem( parts.engines.vr_6:0x0000c884r ); // spark
                inv.insertItem( parts.engines.vr_6:0x00000089r ); // exhaust_camshaft
                inv.insertItem( parts.engines.vr_6:0x0000a984r ); // exhaust_camshaft_weel
		inv.insertItem( parts.engines.vr_6:0x0000008Ar ); // intake_camshaft
                inv.insertItem( parts.engines.vr_6:0x0000b184r ); // intake_camshaft_weel
		inv.insertItem( parts.engines.vr_6:0x00000058r ); // camshaft_bearing_bridge
                inv.insertItem( parts.engines.vr_6:0x0000b284r ); // camshaft_bearing_bridge_nut
		inv.insertItem( parts.engines.vr_6:0x0000008Fr ); // valve_cover
                inv.insertItem( parts.engines.vr_6:0x0000a284r ); // oil_cover
                inv.insertItem( parts.engines.vr_6:0x0000a384r ); // cylinder_head_cover_nut
                inv.insertItem( parts.engines.vr_6:0x0000008Cr ); // exhaust_header
                inv.insertItem( parts.engines.vr_6:0x0000e384r ); // exhaust_header_nut
		inv.insertItem( parts.engines.vr_6:0x00000090r ); // intake_manifold
		inv.insertItem( parts.engines.vr_6:0x0000b884r ); // intake_manifold_underpart
                inv.insertItem( parts.engines.vr_6:0x0000b984r ); // intake_manifold_screw
                inv.insertItem( parts.engines.vr_6:0x0000c184r ); // intake_manifold_screw2
                inv.insertItem( parts.engines.vr_6:0x0000d684r ); // throttle
                inv.insertItem( parts.engines.vr_6:0x0000e184r ); // throttle_screw
                inv.insertItem( parts.engines.vr_6:0x0000b484r ); // upper_timing
                inv.insertItem( parts.engines.vr_6:0x0000b584r ); // upper_timing_screw
                inv.insertItem( parts.engines.vr_6:0x0000c284r ); // distributor
                inv.insertItem( parts.engines.vr_6:0x0000c384r ); // distributor_screw
                inv.insertItem( parts.engines.vr_6:0x00000091r ); // fuel_rail
                inv.insertItem( parts.engines.vr_6:0x00000047r ); // upper_chain
                inv.insertItem( parts.engines.vr_6:0x00000088r ); // lower_chain
                inv.insertItem( parts.engines.vr_6:0x00000048r ); // alternator_drive_belt
                inv.insertItem( parts.engines.vr_6:0x0000d484r ); // crankshaft_weel
                inv.insertItem( parts.engines.vr_6:0x0000c484r ); // cable_guide
                inv.insertItem( parts.engines.vr_6:0x0000c584r ); // cable_guide1
                inv.insertItem( parts.engines.vr_6:0x0000c684r ); // cable_guide2
                inv.insertItem( parts.engines.vr_6:0x0000c984r ); // spark_Ignition
                inv.insertItem( parts.engines.vr_6:0x0000d884r ); // air_hose
                inv.insertItem( parts.engines.vr_6:0x0000d784r ); // air_box
                inv.insertItem( parts.engines.vr_6:0x0000c784r ); // cover
                inv.insertItem( parts.engines.vr_6:0x0000e284r ); // Valve
                inv.insertItem( parts.engines.vr_6:0x0000e584r ); // radiator
                inv.insertItem( parts.engines.vr_6:0x0000e684r ); // oil_return_hose
                inv.insertItem( parts.engines.vr_6:0x0000e784r ); // water_hose
                inv.insertItem( parts.engines.vr_6:0x0000e884r ); // water_tank
                inv.insertItem( parts.engines.vr_6:0x0000e984r ); // oil_cooler
                inv.insertItem( parts.engines.vr_6:0x0000a948r ); // petrol_line
                inv.insertItem( parts.engines.vr_6:0x0000b248r ); // oil_cooler_line
                inv.insertItem( parts.engines.vr_6:0x0000b148r ); // oil_cooler2
                	
	}
}