package java.game;

import java.io.*;
import java.util.*;
import java.util.resource.*;
import java.render.*;	//Text
import java.render.osd.*;	//Text
import java.render.osd.dialog.*;	//Text
import java.sound.*;

import java.game.parts.*;


public class Garage extends Scene implements GameState
{
	final static int  RID_GARAGE1 =			misc.garage:0x0000007ar;
	final static int  RID_GARAGE1_STUFF =	misc.garage:0x00000042r;
	final static int  RID_GARAGE2 =			misc.garage:0x00000006r;
	final static int  RID_GARAGE2_STUFF =	misc.garage:0x00000018r;
	final static int  RID_GARAGE3 =			misc.garage:0x000000c7r;
	final static int  RID_GARAGE3_STUFF =	misc.garage:0x0000003cr;
	//roc "garage"
	final static int  RID_GARAGE4 =			misc.garage:0x0000002Fr;
	final static int  RID_GARAGE4_STUFF =	misc.garage:0x00000051r;

	int		garageIndex;
	int[]	garageID, garageStuffID;
	ResourceRef	[]	garageEnvMaps;

	RenderRef	light, lighttype;

	// color constants
	final static int  BUTTON_DEFAULT_STATE_COLOR = 0xFFC0C0C0;
	final static int  BUTTON_ACTIVE_STATE_COLOR = 0xFFFFFFFF;

	RenderRef	tmp;

	//editing modes
	final static int  MODE_NONE = 0;
	final static int  MODE_SZEREL = 1;
	final static int  MODE_PAINT = 2;
	final static int  MODE_TEST = 3;
	final static int  MODE_TUNE = 4;


	final static int  CMD_NONE			= 100;
	final static int  CMD_MAINMENU		= 101;
	final static int  CMD_MENU			= 107;
	final static int  CMD_ROC			= 108;
	final static int  CMD_HITTHESTREET	= 109;
	final static int  CMD_TESTTRACK		= 110;
	final static int  CMD_CARLOT		= 111;
	final static int  CMD_BUYCARS		= 112;
	final static int  CMD_CATALOG		= 113;
	final static int  CMD_CLUBINFO		= 114;
	final static int  CMD_CARINFO		= 115;
	final static int  CMD_TIME			= 116;
	final static int  CMD_MECHANIC		= 117;
	final static int  CMD_PAINT			= 118;
	final static int  CMD_ESCAPE		= 119;
	final static int  CMD_ROCRACE		= 120;
	final static int  CMD_ROCTEST		= 121;
	final static int  CMD_BUYCARSUSED	= 122;
	final static int  CMD_TEST			= 123;
	final static int  CMD_TUNE			= 124;
	final static int  CMD_ROCINFO		= 125;
	final static int  CMD_ROCQUIT		= 126;
	final static int  CMD_CHEATMONEY	= 127;
	final static int  CMD_BEGIN_ROC		= 128;
	final static int  CMD_RELASE_CAR	= 129;
	final static int  CMD_LOCK_CAR		= 130;
	final static int  CMD_TIME_6H		= 131;
	final static int  CMD_ENGINE		= 132;
	final static int  CMD_BODY			= 133;
	final static int  CMD_RUNNING_GEAR	= 134;
	final static int  CMD_TRACKSELECT	= 135;
	final static int  CMD_DRIVERELECT	= 136;
	final static int  CMD_JACK			= 137;
	final static int  CMD_SAVE_GAME 	= 148;

// Hydraulic suspension:
	final static int	CMD_SUSP_FL		= 138;
	final static int	CMD_SUSP_F		= 139;
	final static int	CMD_SUSP_FR		= 140;
	final static int	CMD_SUSP_LS		= 141;
	final static int	CMD_SUSP_ALL	= 142;
	final static int	CMD_SUSP_RS		= 143;
	final static int	CMD_SUSP_RL		= 144;
	final static int	CMD_SUSP_R		= 145;
	final static int	CMD_SUSP_RR		= 146;
	final static int	CMD_SUSP_MODE	= 147;

	final static Vector3 StartPos = new Vector3 (0, 0, 0);
	final static Ypr StartYpr = new Ypr ( 0, 0, 0);
	final static Vector3 defLookPos = new Vector3(0, 0.0, 0.0);

	Player			player;
	ControlSetState	css;

	Roc				roc;

	Osd				osd;
	GameRef         camera;
	Vector3			cameraPos = new Vector3( -3.0, 1.5,-2.0 );
	Ypr				cameraOri = new Ypr( -2.05, -0.25, 0);

	GameState		parentState;

	Mechanic		mechanic;
	int				filterEngine, filterBody, filterRGear; 
	Painter			painter;
	int				lastPaintCanId, lastPainterLine, showDecals, lastPaintMode=Painter.MODE_PAINTPART;

//	GameRef         cursor;
	int             mode, drag, move, mode_memory=MODE_SZEREL;
	int				prevMode;
	int				menuGroup, menuGroup2;
	int				menuVisible;
//	int				inputMode = 1;
	// garage
	//GameRef         map;
	RenderRef		stuff;

	float			CarMass, CarY, DiffY, JackWait;
	int				JackDamage, JackStatus, SFX_Loop_ID, JackHit, SavePos, ClutchStatus = 1;
	Button			JackButton, ClutchButton;
	Vector3			JackPos = new Vector3( 0.0, -0.2, 0.0), JackVehPos = new Vector3(0.0, 0.0, 0.0), CarVector = new Vector3 (0.0, 0.0, 0.0);
	Ypr				CarYpr = new Ypr(0.0, 0.0, 0.0);
	RenderRef		JackArm;
	PhysicsRef		JackPhys = new PhysicsRef();
	Thread			JackThread;
	Text			DebugText;
	Vehicle			JackVeh, Car2;

	final static SfxRef  Jack_Move_SFX = new SfxRef( MW_Mod:0x0095r );
	final static SfxRef  Jack_Stop_SFX = new SfxRef( MW_Mod:0x0096r );
	
	Text			moneytxt, daytxt, timetxt, invLineTxt, prestigeTxt, infoline;

	public Garage()
	{
		createNativeInstance();

		//patch
		InventoryItem x = new InventoryItem();

		garageID=new int[GameLogic.CLUBS+1]; garageStuffID=new int[GameLogic.CLUBS+1];
		garageID[0]=RID_GARAGE1; garageStuffID[0]=RID_GARAGE1_STUFF;
		garageID[1]=RID_GARAGE2; garageStuffID[1]=RID_GARAGE2_STUFF;
		garageID[2]=RID_GARAGE3; garageStuffID[2]=RID_GARAGE3_STUFF;
		garageID[3]=RID_GARAGE4; garageStuffID[3]=RID_GARAGE4_STUFF;

		garageEnvMaps = new ResourceRef[GameLogic.CLUBS+1];
		garageEnvMaps[0] = new ResourceRef( maps.skydome:0x0036r );
		garageEnvMaps[1] = new ResourceRef( maps.skydome:0x0037r );
		garageEnvMaps[2] = new ResourceRef( maps.skydome:0x0038r );
		garageEnvMaps[3] = new ResourceRef( maps.skydome:0x0039r );

		internalScene = 1;	//nem generalunk napot mint extra fenyforrast
	}

//----------------------------------------------------------------------
	
	final static public float Check( float key )
	{
		return Math.sqrt(key)+3.75;
	}

	public void enter( GameState prevState )
	{
		float key = Math.random()*100;
		if( MainMenu.Check(key) != Math.sqrt(key)+3.75 ) Mirans_Mod_protection_error______Please_Resintal_Mirans_Mod();

		Frontend.loadingScreen.show();

		if( !parentState )
			parentState=prevState;

		player=GameLogic.player;

		if( roc )
			garageIndex = GameLogic.CLUBS;
		else
			garageIndex = player.club;

		map = new GroundRef( garageID[garageIndex] );
		stuff = new RenderRef( map, garageStuffID[garageIndex], null );

		osd = new Osd();
		osd.globalHandler = this;
		osd.defSelection = 5;
		osd.orientation = 1;
		createOSDObjects();

		JackArm = new RenderRef( map, MW_Mod:0x0037r, null );
		JackPhys.createBox( map, 1.020, 0.01, 1.590, "Phys" );

		if ( JackStatus == 0 || JackStatus == 4 || JackStatus == 5)
		{// Down
			JackPhys.setMatrix(new Vector3(JackPos), null );
			JackArm.setMatrix(new Vector3(JackPos), null );
		}
		else
		{// Up
			JackPhys.setMatrix(new Vector3(0.0, -3, 0.0), null ); //Place under track
		}

		if( player.car )
		{
			player.car.setDamageMultiplier( 0.0 );
			player.car.setCruiseControl( 0 );

			if( StartPos.x == 0 && StartPos.y == 0 && StartPos.z == 0 ) // StartPos isn't member old pos
			{
				if(player.car.chassis)
				{
					if( player.car.chassis.wheels < 4 || player.car.chassis.getMax().x < 0.5 ) // wheels < 4 ,or car wide < 1m
					{
						StartPos = new Vector3( 7.0, 1.21, 6.0);
						StartYpr = new Ypr( -1.2, 0, 0);
					}
				}
			}
		}

		lockCar();

		//---------------------------------time of day dependent stuff:
		addSceneElements( GameLogic.getTime() );
		GfxEngine.setGlobalEnvmap( garageEnvMaps[garageIndex] );
		//-----------------------------------------------------------------------

		camera = new GameRef( map, GameRef.RID_CAMERA, cameraPos.x + ", 1.7, " + cameraPos.z + "," + cameraOri.toString() + ", 0x13, 1.0,1.0, 0.05", "Internal camera for garage" );
		cameraSetup( camera );

		osd.endGroup();

		painter = new Painter( player, osd, moneytxt, infoline, 0 );
		painter.lastPaintMode = lastPaintMode;
		painter.showDecals = showDecals;
		painter.paintCans.lastCanId = lastPaintCanId;
		painter.paintCans.scrollToLine( lastPainterLine );

		mechanic = new Mechanic( player, osd, moneytxt, infoline, 0 );
		mechanic.camera = camera;
		mechanic.map = map;

		if( roc )
		{
			painter.flags|=Painter.PF_REDUCED_FUNCTIONALITY;
			mechanic.flags|=Mechanic.MF_FREE_REPAIRS;
		}
		else
		{
			painter.flags&=~Painter.PF_REDUCED_FUNCTIONALITY;
			mechanic.flags&=~Mechanic.MF_FREE_REPAIRS;
		}

		lighttype = new RenderRef();
		lighttype.duplicate( new RenderRef(misc.garage:0x001Dr) );
		//lighttype.setLight( 0x00DC6464, 0x00646464, 0x00C8C8C8);
		light = new RenderRef( map, lighttype, "neon" );

		osd.show();
		GameLogic.setTimerText( daytxt, timetxt );

		//segitunk neki, ne a mechanic.shownak kelljen mindig elintezni!
		mechanic.filterInventory( filterEngine, filterBody, filterRGear );
		mechanic.filterEngine=filterEngine;
		mechanic.filterBody=filterBody;
		mechanic.filterRGear=filterRGear;
		if( player.car )
		{
			player.car.command( "filter 1 " + filterEngine );
			player.car.command( "filter 2 " + filterBody );
			player.car.command( "filter 3 " + filterRGear );
			player.car.wakeUp();
			player.car.command( "suspend" );
		}

		Frontend.loadingScreen.display();

		setEventMask( EVENT_COLLISION|EVENT_CURSOR|EVENT_COMMAND|EVENT_TIME );

		addNotification( player.car, EVENT_COLLISION, EVENT_SAME, null );
		addTimer( 1, 2 );	//trigger ten sec tick

		/*VehicleDescriptor nee = GameLogic.getVehicleDescriptor( VehicleType.VS_NRACE );
		Car2 = new Vehicle( map, nee.id, nee.colorIndex, Math.random()*2, Math.random()*2, Math.random()*0.5, Math.random()*0.5 );
		Car2.setMatrix( new Vector3( 4.0, 0.0, 0.0 ), null );
		Car2.command( "reset" );
		Car2.wakeUp();*/

		// special request: reset mouse and set sensitivity to 0
		Input.getAxis (1, -1);
		Input.cursor.enable(1);

		Input.cursor.addHandler(this);	//kivancsiak vagyunk ra, mit csinal az eger
		Input.cursor.enableCameraControl( camera );

		changeMode(mode_memory);

		if( !(prevState instanceof ClubInfo || prevState instanceof CarInfo || prevState instanceof Catalog || prevState instanceof Garage || prevState instanceof RocInfo) )
		{
			Sound.changeMusicSet( Sound.MUSIC_SET_GARAGE );
			new SfxRef( GameLogic.SFX_ENTERGARAGE ).play(); 
		}

		//display welcome dialog
		if( roc )
		{
			if( roc.init )
			{
				giveWarning( "ROC", "Bem-vindo a Race Of Champions! \n \n Os 16 melhores corredores de rua do mundo estão prontos para lutar pelo premio e orgulho que este evento raro traz para um deles. \n Sao 4 rodadas, cada uma com 3 corridas - apenas os pilotos e carros mais resistentes podem passar. Va em frente!");
			roc.init = 0;
			}
		}
		else
		{
			if( !player.car )	//not displaying in debug modes
			{
				if( player.checkHint(Player.H_GARAGE) )
					giveWarning("Slrr Brazil Edition!", "Bem-vindo ao Street Legal Racing! \n \n Sua garagem esta vazia. Voce pode comprar carros nas revendedoras. Visite agora o revendedor de carros usados e escolha uma lasanha para comecar! \n Durante o dia, participe de corridas para ganhar prestigio e dinheiro. A noite, compita para subir no ranking geral.");
			}
		}

		GameLogic.played=1;

	}

	public void exit( GameState nextState )
	{
		Jack_Move_SFX.stop( SFX_Loop_ID );  // stop move sfx

		clearEventMask( EVENT_ANY );

		if( !(nextState instanceof ClubInfo || nextState instanceof CarInfo || nextState instanceof Catalog || nextState instanceof Garage || nextState instanceof RocInfo) )
		{
			new SfxRef( GameLogic.SFX_LEAVEGARAGE ).play(); 
		}

		if (JackThread)
		{
			JackThread.stop();
			JackThread=null;
		}
	
		JackArm.destroy();
		JackPhys.destroy();
		JackHit = 0;
		if( JackVeh ) 
		{	
			JackVeh.destroy();
			JackVeh = null;
		}

		mode_memory = mode;
		changeMode(MODE_NONE);

		Input.cursor.enable(0);
		Input.cursor.remHandler(this);
		Input.cursor.disableCameraControl();

		cameraPos = camera.getPos();
		cameraOri = camera.getOri();
		camera.destroy();

		osd.hide();
		osd=null;

		if( tmp )
		{
			tmp.destroy();
			tmp=null;
		}

		mechanic.flushInventory();
		filterEngine=mechanic.filterEngine;
		filterBody=mechanic.filterBody;
		filterRGear=mechanic.filterRGear;
		mechanic = null;

		if( player.car )
		{
			player.car.command( "filter 1 0" );
			player.car.command( "filter 2 0" );
			player.car.command( "filter 3 0" );
			player.car.wakeUp();
			player.car.command( "suspend" );

			if ( SavePos == 1 )
			{
				StartPos = player.car.getPos();
				StartYpr = player.car.getOri();
				SavePos = 0;
			}
			else
			{
				StartPos = new Vector3(0, 0, 0);
				StartYpr = new Ypr(0, 0, 0);
				JackStatus = 0;
			}
		}
		else
		{
			SavePos = 0;
			JackStatus = 0;
		}

		lastPaintCanId = painter.paintCans.lastCanId;
		lastPainterLine = painter.paintCans.currentLine();
		showDecals = painter.showDecals;
		lastPaintMode = painter.lastPaintMode;
		painter=null;

		if( player.car )
			player.car.setDamageMultiplier( Config.player_damage_multiplier );

		releaseCar();

		//leotjuk a villanyt
		light.destroy();
		lighttype.destroy();

		//----------------------------------------
		remSceneElements();
		//----------------------------------------

		stuff.destroy();
		map.unload();

		player.controller.reset();
		player.controller.activateState(ControlSet.MENUSET);

		//GameLogic.autoSaveQuiet();
	}

	public void run()
	{
		for(;;)
		{
			if( JackStatus == 1 )
			{
				if( JackHit == 0)
				{
					JackVehPos = JackVeh.getPos();
					JackArm.setMatrix(new Vector3(JackPos.x, JackVehPos.y, JackPos.z), null );
					player.car.wakeUp();
					player.car.command( "suspend" );
				}
				if ( JackHit == 1 )
				{
					Jack_Move_SFX.stop( SFX_Loop_ID );  // stop move sfx
					Jack_Stop_SFX.play(JackPos, 0.0, 1.0, 1.0, 0); // SFX Stop

					//JackHit = 0;
					System.timeWarp(1.0);

					CarVector = player.car.getPos();
					DiffY = JackVehPos.y - CarVector.y;

					Thread.sleep(1500);

					if(player.car.chassis) CarMass = player.car.chassis.getMass(); else CarMass = 1500;
					CarVector = new Vector3 (player.car.getPos()); // get car position
					CarVector.z -= 0.2; // correct 'getPos' bug
					CarYpr = new Ypr (player.car.getOri()); // get car rotatio

					if (CarMass < 2800)
					{
						// Up position calculating:
						new SfxRef(MW_Mod:0x0042r).play(JackPos, 0.0, 1.0, 1.0, 0); // SFX Move Up
						Vector3 CarUpVector = new Vector3 (CarVector); // get car position for Up position
						CarUpVector.y += CarMass*0.0017+0.9; // Weight calculate

						// Set down and up positions, move:
						player.car.setMatrix( new Vector3 (JackPos.x, CarUpVector.y, JackPos.z), new Ypr(CarYpr) ); // Set car Up position
						player.car.command( "stop" ); // Aligin to Up position
						player.car.setMatrix( new Vector3 (CarVector), new Ypr(CarYpr) ); // Set car Down position
						player.car.wakeUp();
						player.car.command( "setsteer -0.7" );

						JackWait = System.simTime() + 4;
					}
					else
					if (CarMass < 3000) 
					{
						// Up position calculating:
						new WarningDialog( player.controller, Dialog.DF_MODAL|Dialog.DF_DEFAULTBG|Dialog.DF_LOWPRI, "Sobre Carga", "O Peso do seu carro e maior do que a capacidade maxima recomenda do elevacar. \n Cuidado..." ).display();
						
						Thread.sleep(800);
						JackWait = System.simTime() + 4;
						new SfxRef(MW_Mod:0x0042r).play(JackPos, 0.0, 1.0, 1.0, 0); // SFX Move Up

						Vector3 CarUpVector = new Vector3 (CarVector); // get car position for Up position
						CarUpVector.y += CarMass*0.0017+0.9; // Weight calculate

						new SfxRef(MW_Mod:0x0044r).play(JackPos, 0.0, 1.0, 1.5, 0); // SFX Creak

						player.car.setMatrix( new Vector3 (CarUpVector), new Ypr(CarYpr) ); // Set car Up position
						player.car.command( "stop" ); // Aligin to Up position
						player.car.setMatrix( new Vector3 (CarVector), new Ypr(CarYpr) ); // Set car Down position
						player.car.wakeUp();
						player.car.command( "setsteer -0.7" );	
					}
					else
					{
						// Up position calculating:
						JackWait = System.simTime() + 1.1;
						JackDamage = 1;

						Vector3 CarUpVector = new Vector3 (CarVector); // get car position for Up position
						CarUpVector.y += CarMass*0.0017+0.9;
			
						player.car.setMatrix( new Vector3 (CarUpVector), new Ypr(CarYpr) ); // Set car Up position
						player.car.command( "stop" );
						player.car.setMatrix( new Vector3(CarVector), new Ypr(CarYpr) );
						player.car.wakeUp();
					}

					JackStatus = 2;
				}
				else
				if (JackVehPos.y > 1)
				{
					Jack_Move_SFX.stop( SFX_Loop_ID );  //end move sfx
					Jack_Stop_SFX.play(JackPos, 0.0, 1.0, 1.0, 0); // SFX Stop

					JackStatus = 0; // Turn off

					if (JackVeh)
					{
						JackVeh.destroy();
						JackVeh = null;
					}
					System.timeWarp(1.0);
					
					Thread.sleep(1000);
					new SfxRef(Frontend:0x007Er).play(); // SFX
					new WarningDialog( player.controller, Dialog.DF_MODAL|Dialog.DF_DEFAULTBG, "Informacao", "A altura do solo do seu carro esta muito alta ou seu carro nao esta estacionado sobre o braço do elevacar." ).display();
					
					Thread.sleep(1000);
					SFX_Loop_ID = Jack_Move_SFX.play(JackPos, 0.0, 1.0, 1.0, 0 ); // SFX Move
					
					JackStatus = 5;
				}
			}
			else
			if( JackStatus == 2 )
			{
				CarVector = player.car.getPos();
				JackArm.setMatrix( new Vector3(JackPos.x, CarVector.y + DiffY, JackPos.z), null );
				
				if( JackDamage==1 && JackWait < System.simTime() )
				{
					JackWait = System.simTime() + 2.5;
					JackDamage = 2;

					new SfxRef(MW_Mod:0x0045r).play(JackPos, 0.0, 1.0, 1.5, 0); // SFX Creak2
					player.car.command( "start" ); // fall down
				}
				else
				if( JackDamage==2 && JackWait < System.simTime() )
				{
					JackDamage = 3;
					DamageJack();
				}
				else
				if( JackDamage==3 )
				{
					// Empty
				}
				if( JackWait < System.simTime() )
				{
					JackButton.enable();
					JackButton.changeTexture( new ResourceRef( MW_Mod:0x0040r ) ); // Jack up
					JackStatus = 3;
				}

			}
			else
			if( JackStatus == 3 )
			{
				CarVector = player.car.getPos();
				JackArm.setMatrix( new Vector3(JackPos.x, CarVector.y + DiffY, JackPos.z), null );
				player.car.command( "suspend" );
				//DebugText.changeText( CarVector.y );
			}
			if( JackStatus == 4 )
			{
				CarVector = player.car.getPos();
				JackArm.setMatrix( new Vector3(JackPos.x, CarVector.y + DiffY, JackPos.z), null );

				if( JackWait < System.simTime() )
				{
					SFX_Loop_ID = Jack_Move_SFX.play(JackPos, 0.0, 1.0, 1.0, 0 ); // SFX Move

					JackStatus = 5;
					JackVehPos = player.car.getPos();
					JackVehPos.y += DiffY;

					player.car.wakeUp();
					player.car.command( "start" );
					player.car.command( "brake" );
				}
			}
			if( JackStatus == 5 )
			{
				JackVehPos.y -= 0.005;
				JackArm.setMatrix( new Vector3(JackPos.x, JackVehPos.y, JackPos.z), null );

				if( JackVehPos.y <= JackPos.y )
				{
					Jack_Move_SFX.stop( SFX_Loop_ID );  // stop move sfx
					Jack_Stop_SFX.play(JackPos, 0.0, 1.0, 1.0, 0); // SFX Stop

					JackStatus = 0;
					ClutchButton.enable();
					JackHit = 0;

					JackButton.changeTexture( new ResourceRef( MW_Mod:0x0038r ) );
					JackButton.enable();

					player.car.command( "start" );
					player.car.command( "stop" );

					JackPhys.setMatrix(new Vector3(JackPos), null );

					JackThread.stop();
				}
			}

			JackThread.sleep(20);
		}
	}

	public void DamageJack()
	{
		player.car.command( "stop" );
		
		new WarningDialog( player.controller, Dialog.DF_MODAL|Dialog.DF_DEFAULTBG, "Sobre Carga", "Seu carro esta muito pesado para este elevacar! Voce danificou o elevacar da equipe e precisa pagar pelo reparo. Voce perde alguns pontos de prestigio por imprudencia! Você pode voltar a garagem quando o elevacar estiver reparado. Isso pode levar alguns dias. \n OBRIGADO..." ).display();

		JackDamage = 0;
		JackStatus = 0; // Turn off
		ClutchButton.enable();
		JackHit = 0;
		JackButton.changeTexture( new ResourceRef( MW_Mod:0x0038r ) );
		JackButton.enable();
		JackPhys.setMatrix(new Vector3(JackPos), null );
		JackArm.setMatrix(new Vector3(JackPos), null );

		GameLogic.spendTime((1+Math.random()*5)*86400); // jack reprair time				
		player.prestige-=(Math.random()*0.035+0.02); // lose prestige points
		player.money-=1250; // money for reprair
		refreshMoneyString();

		player.car.setMatrix( new Vector3( 7.0, -0.21, 6.0), new Ypr( -1.2, 0, 0) );
		player.car.command( "start" );
		player.car.command( "stop" );

		JackThread.stop();
	}

	public void cameraSetup( GameRef cam )
	{
		cam.command( "render " + osd.getViewport().id() + " 0 0 1 " + (Viewport.RENDERFLAG_CLEARDEPTH | Viewport.RENDERFLAG_CLEARTARGET) ); // render viewport_ID camera_ID flags //
		cam.command( "dist 1.0 10.0");
		cam.command( "smooth 0.05 0.5");
		cam.command( "zoom 60 5");
		cam.command( "force 0.3 0.5 -0.7" );	//defaults are in config.java
		cam.command( "torque 0.08" );

		if (player.car)
		{
			cam.command( "move " + player.car.id() + " 0,0,0 3.5" );
			cam.command( "look " + player.car.id() + " 0,0,0 0,0,0" );
		} else
		{
			cam.command( "move " + map.id() + " " + defLookPos.toString() + " 3.5" );
			cam.command( "look " + map.id() + " " + defLookPos.toString() + " 0,0,0" );
		}

		player.controller.reset();
		player.controller.activateState(ControlSet.CAMTURNSET);

	}

	public void createOSDObjects()
	{
		Style buttonStyle;
		Menu m;

		buttonStyle = new Style( 0.12, 0.12, Frontend.mediumFont, Text.ALIGN_LEFT, null );
		m = osd.createMenu( buttonStyle, -0.98, -0.8795, 0, Osd.MD_HORIZONTAL );
		Gadget g;

		if( !roc )
		{	//normal menu
			g = m.addItem( new ResourceRef( frontend:0x011Dr ), CMD_TRACKSELECT, "Escolher Pista" );
			g = m.addItem( new ResourceRef( frontend:0x011Fr ), CMD_ROC, "Entrar na Race Of Champions" ); if( (GameLogic.gameMode == GameLogic.GM_SINGLECAR) && (!GameLogic.cheats)) g.disable();
			m.addSeparator();
			m.addSeparator();
			m.addSeparator();
			g = m.addItem( new ResourceRef( MW_Mod:0x0070r ), CMD_HITTHESTREET, "Mudar Motorista" );
			//g = m.addItem( new ResourceRef( frontend:0x011Er ), CMD_TESTTRACK, "Test Track" );
			m.addSeparator();
			g = m.addItem( new ResourceRef( frontend:0x0120r ), CMD_CARLOT, "Estacionamento" ); if( GameLogic.gameMode == GameLogic.GM_SINGLECAR ) g.disable();
			g = m.addItem( new ResourceRef( frontend:0x0121r ), CMD_BUYCARS, "Concessionaria" ); if( GameLogic.gameMode == GameLogic.GM_SINGLECAR ) g.disable();
			g = m.addItem( new ResourceRef( frontend:0x0122r ), CMD_BUYCARSUSED, "Ferro Velho" ); if( GameLogic.gameMode == GameLogic.GM_SINGLECAR ) g.disable();
			m.addSeparator();
			g = m.addItem( new ResourceRef( frontend:0x0125r ), CMD_CATALOG, "Catalogo Pecas" ); if( (GameLogic.gameMode == GameLogic.GM_SINGLECAR) && (!GameLogic.cheats)) g.disable();
			g = m.addItem( new ResourceRef( frontend:0x0123r ), CMD_CLUBINFO, "Ranking Geral" ); if( GameLogic.gameMode == GameLogic.GM_SINGLECAR ) g.disable();
			g = m.addItem( new ResourceRef( frontend:0x0124r ), CMD_CARINFO, "Detalhes do Carro" ); if( player.car) if( !player.car.chassis ) g.disable();
			m.addSeparator();
			g = m.addItem( new ResourceRef( frontend:0x0129r ), CMD_MECHANIC, "Instalar/Remover Pecas" );
			g = m.addItem( new ResourceRef( frontend:0x0128r ), CMD_TUNE, "Acerto Fino" );
			g = m.addItem( new ResourceRef( frontend:0x012Cr ), CMD_PAINT,"Pintura" );
			g = m.addItem( new ResourceRef( frontend:0x0127r ), CMD_TEST, "Testar Motor" );
			g = m.addItem( new ResourceRef( MW_Mod:0x0055r ), CMD_TIME, "Avancar 1 Hora" );
			g = m.addItem( new ResourceRef( frontend:0x012Ar ), CMD_TIME_6H, "Avancar 6 Horas" );
			m.addSeparator();

			if( GameLogic.cheats )
			{
				m.addItem( new ResourceRef( frontend:0x00B4r ), CMD_CHEATMONEY, "[CHEAT] CRASH TO DESKTOP ;)" );
			}
			else
			{
				m.addSeparator();
				// m.addSeparator();
			}
			m.addSeparator();
			// m.addSeparator();
			g = m.addItem( new ResourceRef( frontend:0x016Br ), CMD_SAVE_GAME, "Salvar jogo" );
			g = m.addItem( new ResourceRef( Osd.RID_BACK ), CMD_MAINMENU, "Voltar ao Menu Principal" );
			//-----------------------Left Menu-----------------------------------------------------
			//osd.createRectangle( -1.32, -0.82, 1.2, 0.22, -1, new ResourceRef(frontend:0x0024r) );
			m = osd.createMenu( buttonStyle, -0.98, -0.8795, 0, Osd.MD_HORIZONTAL );
			m.addSeparator();
			m.addSeparator();
			m.addSeparator();
			m.addSeparator();
			m.addSeparator();
			if ( JackStatus == 0 )	JackButton = m.addItem( new ResourceRef( MW_Mod:0x0038r ), CMD_JACK, "Jack" ); else JackButton = m.addItem( new ResourceRef( MW_Mod:0x0040r ), CMD_JACK, "Jack" );
		}
		else
		{	//ROC menu
			m.addItem( new ResourceRef( frontend:0x011Fr ), CMD_ROCRACE, "Proxima Corrida" );
			m.addItem( new ResourceRef( frontend:0x011Er ), CMD_ROCTEST, "Volta de Aquecimento" );
			m.addSeparator();
			m.addSeparator();
			m.addSeparator();
			m.addSeparator();
			m.addSeparator();
			m.addSeparator();
			m.addSeparator();
			m.addSeparator();
			m.addSeparator();
			m.addSeparator();
			m.addSeparator();
			m.addSeparator();
			m.addSeparator();
			m.addSeparator();
			m.addItem( new ResourceRef( frontend:0x0123r ), CMD_ROCINFO, "Ranking ROC" );
			m.addItem( new ResourceRef( frontend:0x0124r ), CMD_CARINFO, "Detalhes do seu carro" );
			m.addSeparator();
			m.addSeparator();
			m.addSeparator();
			m.addItem( new ResourceRef( frontend:0x0129r ), CMD_MECHANIC, "Instalar/Remover Pecas" );
			m.addItem( new ResourceRef( frontend:0x0128r ), CMD_TUNE, "Acerto Fino" );
			m.addItem( new ResourceRef( frontend:0x012Cr ), CMD_PAINT,"Pintura" );
			m.addItem( new ResourceRef( frontend:0x0127r ), CMD_TEST, "Testar Motor" );
			m.addSeparator();
			m.addSeparator();
			m.addSeparator();
			m.addSeparator();
			m.addSeparator();
			m.addSeparator();
			m.addSeparator();
			m.addSeparator();
			m.addItem( new ResourceRef( Osd.RID_BACK ), CMD_ROCQUIT, "Abanadonar Race Of Champions" );
		}

		menuGroup = osd.endGroup();
		menuVisible=1;

		m = osd.createMenu( buttonStyle, 0.46, -0.8795, 0, Osd.MD_HORIZONTAL );
		m.addItem( new ResourceRef( frontend:0x011Ar ), CMD_ENGINE, "Mostrar/Esconder Pecas Motor" );
		m.addItem( new ResourceRef( frontend:0x011Br ), CMD_BODY, "Mostrar/Esconder Pecas Lataria" );
		m.addItem( new ResourceRef( frontend:0x011Cr ), CMD_RUNNING_GEAR, "Mostrar/Esconder Pecas Suspensao" );
		m.addSeparator();
		//m.addItem( new ResourceRef( frontend:0x0084r ), CMD_LOCK_CAR, "Press Clutch Pedal" );
		ClutchButton = m.addItem( new ResourceRef( MW_Mod:0x0094r ), CMD_RELASE_CAR, "Liberar Embreagem" );
		m.addItem( new ResourceRef( Osd.RID_BACK ), CMD_TEST, "Sair do modo de Teste" );
		osd.hideGroup( menuGroup2 = osd.endGroup() );


		//---------------------------------------------------------------------------------
		//default group - ide raktuk masodiknak, amig a defSelectiont meg nem csinaljuk jol
		osd.createRectangle( 0.0, -0.88, 2.0, 0.24, -1, new ResourceRef(frontend:0x0133r) );
		//osd.createHeader( "GARAGE" );

		infoline = osd.createText( null, Frontend.smallFont, Text.ALIGN_RIGHT, 0.970, 0.625);
		
		DebugText = osd.createText( null, Frontend.smallFont, Text.ALIGN_CENTER, 0.0, -0.5 );

		String hp = " - (N/A)";
		if (player.car) {
			hp = " - (" + player.car.getHp() + ")";
		}

		//global status
		if( roc )
		{
			osd.createText( player.name + " - " + Roc.roundNames[roc.numRounds()-roc.getCurrentRound()-1] + " of R.O.C." + hp, Frontend.smallFont, Text.ALIGN_LEFT,	-0.95, -0.985);
		}
		else
		{
			if( GameLogic.gameMode == GameLogic.GM_SINGLECAR )
			{
				osd.createText( "Modo Single Player", Frontend.smallFont, Text.ALIGN_LEFT,	-0.95, -0.98);
			}
			else
			{
				int	rank = (GameLogic.CLUBMEMBERS-(GameLogic.findRacer( player ) % GameLogic.CLUBMEMBERS));
				osd.createText( player.name + " em " + GameLogic.CLUBNAMES[garageIndex] + " clube, " + rank + "º Lugar" + " (" + player.getPrestigeString() +")" + hp  , Frontend.smallFont, Text.ALIGN_LEFT,	-0.95, -0.985);

				/**
				 * the validations below always produce the same return
				 */
//				if (rank >= 4 < 21)
//				{
//					osd.createText( player.name + " em " + GameLogic.CLUBNAMES[garageIndex] + " clube, " + rank + "º Lugar" + " (" + player.getPrestigeString() +")" + hp  , Frontend.smallFont, Text.ALIGN_LEFT,	-0.95, -0.985);
//				}
//				else if (rank = 3)
//				{
//					osd.createText( player.name + " em " + GameLogic.CLUBNAMES[garageIndex] + " clube, " + rank + "º Lugar" + " (" + player.getPrestigeString() +")" + hp  , Frontend.smallFont, Text.ALIGN_LEFT,	-0.95, -0.985);
//				}
//				else if (rank = 2)
//				{
//					osd.createText( player.name + " em " + GameLogic.CLUBNAMES[garageIndex] + " clube, " + rank + "º Lugar" + " (" + player.getPrestigeString() +")" + hp  , Frontend.smallFont, Text.ALIGN_LEFT,	-0.95, -0.985);
//				}
//				else if (rank = 1)
//				{
//					osd.createText( player.name + " em " + GameLogic.CLUBNAMES[garageIndex] + " clube, " + rank + "º Lugar" + " (" + player.getPrestigeString() +")" + hp  , Frontend.smallFont, Text.ALIGN_LEFT,	-0.95, -0.985);
//				}
//				else
//				{
//					osd.createText( player.name + " em " + GameLogic.CLUBNAMES[garageIndex] + " clube, " + rank + "º Lugar" + " (" + player.getPrestigeString() +")" + hp  , Frontend.smallFont, Text.ALIGN_LEFT,	-0.95, -0.985);
//				}
			}
		}

		//prestige status
		prestigeTxt = osd.createText( null, Frontend.smallFont, Text.ALIGN_LEFT,	-0.585, -0.985);
		
		if( GameLogic.gameMode != GameLogic.GM_SINGLECAR )
		{
			osd.createText( "Dia ",	Frontend.smallFont, Text.ALIGN_RIGHT,		0.525, -0.985);
			daytxt=osd.createText( null, Frontend.smallFont, Text.ALIGN_LEFT,	0.525, -0.985);
		}

		osd.createText( "Hora:",	Frontend.smallFont, Text.ALIGN_RIGHT,		0.65, -0.985);
		timetxt=osd.createText( null, Frontend.smallFont, Text.ALIGN_LEFT,		0.65, -0.985);

		if( roc )
			moneytxt = null;
		else
		{
			osd.createText( "R$:", Frontend.smallFont, Text.ALIGN_RIGHT,		0.85, -0.985);
			moneytxt=osd.createText( null, Frontend.smallFont, Text.ALIGN_LEFT,	0.85, -0.985);
		}
	
		refreshMoneyString();

		osd.createHotkey( Input.AXIS_MENU, Input.VIRTUAL|Osd.HK_STATIC, CMD_ESCAPE, this );

		osd.endGroup();	
	}

	public void lockCar()
	{
		if( player.car )
		{
			if ( JackStatus == 0 || JackStatus == 4 || JackStatus == 5)
			{ // Down
				player.car.setParent( map );
				player.car.setMatrix( new Vector3(StartPos), new Ypr(StartYpr) );
				player.car.command( "reset" );
				player.car.command( "setsteer -0.7" );
				player.car.command( "stop" );	//grab

				JackStatus = 0;
				JackButton.enable();
				JackButton.changeTexture( new ResourceRef( MW_Mod:0x0038r ) );
			}
			else
			{ // Up			
				player.car.setParent( map );
				Vector3 CarUpVector = new Vector3 (CarVector); // get car position for Up position
				if(player.car.chassis) CarMass = player.car.chassis.getMass(); else CarMass = 2000;
				CarUpVector.y += CarMass*0.0017+0.9; // Weight calculate

				// Set down and up positions, move:
				player.car.setMatrix( new Vector3 (JackPos.x, CarUpVector.y, JackPos.z), new Ypr(CarYpr) ); // Set car Up position
				player.car.command( "stop" ); // Aligin to Up position
				player.car.setMatrix( new Vector3 (JackPos.x, 0.887, JackPos.z), new Ypr(CarYpr) ); // Set car Down position
				player.car.wakeUp();
				player.car.command( "setsteer -0.7" );

				JackStatus = 3;
				JackButton.enable();
				JackButton.changeTexture( new ResourceRef( MW_Mod:0x0040r ) );
				JackThread = new Thread( this, "Jack Animate Refresher" );
				JackThread.start();
			}
		}
	}

	public void releaseCar()	///player. !
	{
		if( player.car )
		{
			player.car.command( "reset" );
			player.car.command( "start" );	//release

			player.car.setParent( player );
		}
	}


	public void refreshMoneyString()
	{
		if( moneytxt ) 
		{
			new SfxRef( Frontend.SFX_MONEY ).play(); 
			moneytxt.changeText( Integer.toString( player.money ) );
		}
	}

	public void changeMode( int newMode )
	{
		if( mode != newMode )
		{
			//-------------mode OFFs
			if( mode == MODE_SZEREL || mode == MODE_TUNE)
			{
				if( newMode != MODE_SZEREL && newMode != MODE_TUNE )
					mechanic.hide();
			}
			else
			if( mode == MODE_PAINT )
			{
				painter.hide();
			}
			else
			if( mode == MODE_TEST )
			{
				player.car.command( "stop" );

				if (player.render)
					player.render.destroy();

				player.controller.command( "leave " + player.car.id() );
				if( player.car.chassis )
				player.controller.command( "camera "+ camera.id() );

				player.hideOsd();

				osdCommand( CMD_MENU );

				//cameraSetup( camera );	//nezzen az autora, stb smooth beallitasok

				player.car.command( "reset" );

				player.controller.reset();
				player.controller.activateState(ControlSet.CAMTURNSET);
			}
			int	oldMode=mode;
			mode=newMode;
			changePointer();
			//-----------mode ONs
			if( mode == MODE_SZEREL || mode == MODE_TUNE)
			{
				if( oldMode != MODE_SZEREL && oldMode != MODE_TUNE )
					mechanic.show();

				if( mode == MODE_SZEREL )
					mechanic.mode = 0;
				else
					mechanic.mode = 1;
			}
			else
			if( mode == MODE_PAINT )
			{
				painter.show();
			}
			else
			if( mode == MODE_TEST )
			{
				osdCommand( CMD_MENU );

				if (!mechanic.filterBody)
				{
					player.render = new RenderRef( map, player.driverID, "player" );
					player.controller.command( "renderinstance " + player.render.id() );
				}

				player.controller.command( "camera 0" );
				player.controller.command( "controllable " + player.car.id() );
				if( player.car.chassis )
				player.car.wakeUp();

				//cameraSetup( camera );	//nezzen az autora, stb smooth beallitasok

				player.controller.reset();
				player.controller.activateState( ControlSet.DRIVERSET );

				player.showOsd();
			}
		}
	}

	public void changePointer()
	{
		if( move )
		{
			Input.cursor.setPointer( Frontend.pointers, "M");
		}
		else
		{
			if( mode == MODE_SZEREL)
			{
				if( drag )
					Input.cursor.setPointer( Frontend.pointers, "A");
				else
					Input.cursor.setPointer( Frontend.pointers, "G");
			}
			else
			if( mode == MODE_TUNE )
				Input.cursor.setPointer( Frontend.pointers, "B");
			else
			if( painter.mode == painter.MODE_COPY && painter.copy_status == 0)
				Input.cursor.setPointer( Frontend.pointers, "J");
			else
			if( mode == MODE_PAINT )
				Input.cursor.setPointer( Frontend.pointers, "D");
			else
				Input.cursor.setPointer( Frontend.pointers, "J");
		}
	}

	public void handleEvent( GameRef obj_ref, int event, int param )
    {
        if( event == EVENT_TIME )
        {
            if( param == 2 )
            {
				addTimer( 1, 2 );	//ten sec tick
				super.refresh( GameLogic.getTime() );
			}
		}
	}

	public void handleEvent( GameRef obj_ref, int event, String param )
	{
		int	tok = -1;

		if( event == EVENT_COLLISION && JackHit == 0 && JackVeh )
        {
			int VehID = JackVeh.id();

			if (VehID == param.token(0).intValue()) // If jack hit player.car
			{
				JackHit = 1;
				JackVehPos = JackVeh.getPos(); JackVeh.destroy(); JackVeh = null;
			}
		}
		else
		if( event == EVENT_CURSOR )
		{
			int	ec = param.token( ++tok ).intValue();

			int	cursor_id = param.token( ++tok ).intValue();

			if (ec == GameType.EC_LDRAGBEGIN)
			{
				if (mode==MODE_SZEREL)
				{
					GameRef draggedItem = obj_ref;
					int reason = draggedItem.getInfo(GameType.GII_GETOUT_OK);
					if( reason==0 )
					{
						drag=1;
						changePointer();
					}
					else
					{
						//Input.cursor.setPointer( Frontend.pointers, "-");
					}
				}
			} 
			else
			if (ec == GameType.EC_LDRAGEND)
			{
				if (mode==MODE_SZEREL)
				{
					//EC_DROP kezeli a tenyleges dobast, itt csak a cursort allitjuk
					drag=0;
					changePointer();
				}
			} 
			else
			if (ec == GameType.EC_LDROP)
			{
				if (mode==MODE_SZEREL)
				{
					GameRef draggedOnto = new GameRef(param.token( ++tok ).intValue());
					GameRef draggedItem = new GameRef(param.token( ++tok ).intValue());
					Vector3 droppos = new Vector3(param.token( ++tok ).floatValue(),
												  param.token( ++tok ).floatValue(),
												  param.token( ++tok ).floatValue());

					int	phy_id = param.token( ++tok ).intValue();

					Object o = draggedOnto.getScriptInstance();
					if( draggedOnto.id() == map.id() || o instanceof Part )
					{	//garazsba (vagy a benne levo kocsira) dropoltak valamit

						//try to put-in
						int cat = draggedItem.getInfo(GameType.GII_CATEGORY);
						if( cat == GIR_CAT_PART || cat == GIR_CAT_VEHICLE )
						{	//kocsirol, kocsira

							Part part = draggedItem.getScriptInstance();

							GameRef xpart = new GameRef();
							int[] slotId = part.install_OK( player.car, 0, xpart, 0, droppos );
							if( slotId )
							{
								String error;
								if( !(error=part.installCheck( xpart.getScriptInstance(), slotId )) )
								{
									new SfxRef( GameLogic.SFX_WRENCH ).play(); 
									//kiszereles time
									GameLogic.spendTime( GameLogic.mechTime( part, 0 ) );
									draggedItem.command( "remove 0 "+map.id());
	
									//beszereles time
									GameLogic.spendTime( GameLogic.mechTime( part, 1 ) );
									draggedItem.command( "install 0 "+player.car.id()+" 0 0 0 "+droppos.x+" "+droppos.y+" "+droppos.z );
									player.car.wakeUp();
								}
								else
									giveWarning( error );
							}
							/*
							else
								giveWarning( "you suck" );
								nem mukodik! Denes vmit valtoztathatott, regen lehetett pl egyik kereket athuzni egyik slotrol a masikra... !?
							*/
						} 
						else
						{	//partsbinbol, kocsira
							
							int item = mechanic.inventory.getItemIDbyButtonPhyId( phy_id );
							String error;
							if( (error=mechanic.inventory.installToCar(item, player.car, droppos )) && error!="")
								giveWarning( error );

						}
					}
				}
			} 
			else

//right button handling: camera control
			if (ec == GameType.EC_RCLICK)
			{
				GameRef dest = new GameRef(param.token( ++tok ).intValue());
				int cat = dest.getInfo(GameType.GII_CATEGORY);
				if( cat == GIR_CAT_PART || cat == GIR_CAT_VEHICLE )
				{
					mechanic.lastLookDestination = dest;
					camera.command( "look " + dest.id() + " " + param.token( ++tok ) + "," + param.token( ++tok ) + "," + param.token( ++tok ) );
				}

			} 
			else
			if (ec == GameType.EC_RDRAGBEGIN)
			{
				move=1;
				changePointer();
				//enable camera control with mouse
				player.controller.user_Add( Input.AXIS_LOOK_UPDOWN,	ControlSet.MOUSE, 1,	-1.0f, 1.0f, -1.0f, 1.0f);
				player.controller.user_Add( Input.AXIS_LOOK_LEFTRIGHT,	ControlSet.MOUSE, 0,	-1.0f, 1.0f, -1.0f, 1.0f);
				//disable cursor movement
				player.controller.user_Del( Input.AXIS_CURSOR_X,	ControlSet.MOUSE, 0 );
				player.controller.user_Del( Input.AXIS_CURSOR_Y,	ControlSet.MOUSE, 1 );
				Input.cursor.cursor.command( "lock" );
			} 
			else
			if (ec == GameType.EC_RDRAGEND)
			{
				move=0;
				changePointer();
				//disable camera control with mouse
				player.controller.user_Del( Input.AXIS_LOOK_UPDOWN,	ControlSet.MOUSE, 1 );
				player.controller.user_Del( Input.AXIS_LOOK_LEFTRIGHT,	ControlSet.MOUSE, 0 );
				//enable cursor movement
				player.controller.user_Add( Input.AXIS_CURSOR_X,	ControlSet.MOUSE, 0,	-1.0f, 1.0f, -1.0f, 1.0f);
				player.controller.user_Add( Input.AXIS_CURSOR_Y,	ControlSet.MOUSE, 1,	-1.0f, 1.0f, -1.0f, 1.0f);
				Input.cursor.cursor.command( "unlock" );
			} 
			else
				;

		}
	}

	public void osdCommand( int cmd )
	{
		if( cmd == CMD_TEST )
		{
			if( mode == MODE_TEST )
			{
				changeMode( prevMode );
			}
			else
			{
				if( player.car )
				{
					ClutchStatus = 1;
					ClutchButton.changeTexture( new ResourceRef(MW_Mod:0x0094r) );

					String e=player.car.isTestable();
					if( !e )
					{
						prevMode = mode;
						player.car.command("reload");
						changeMode( MODE_TEST );

						e=null;
						e=player.car.isDriveable();
						if( e ) ClutchButton.disable(); // Lock riding mode when car missing running gear
					}
					else
						giveWarning( "Voce nao pode testar o carro por " + e );
				}
				else
				{
					giveWarning( "Voce precisa de um carro! \n Compre um na concessionaria ou ferro velho." );
				}
			}
		}
		else
		if( cmd == CMD_ESCAPE )
		{
			if( mode == MODE_TEST )
				osdCommand( CMD_TEST );
		}
		else
		if( cmd == CMD_MENU )
		{
			if( menuVisible )
			{
				osd.hideGroup( menuGroup );
				osd.showGroup( menuGroup2 );
			}
			else
			{
				osd.hideGroup( menuGroup2 );
				osd.showGroup( menuGroup );
			}
			menuVisible=1-menuVisible;
		}
		else
		if( cmd == CMD_MAINMENU )
		{
			GameLogic.changeActiveSection( parentState );
			GameLogic.autoSaveQuiet(); // Save Game
		}
		else 
		if (cmd == CMD_SAVE_GAME )
		{
			if (player.car) {
				Vector3 Pos = player.car.getPos();
				Ypr Ori = player.car.getOri();
				GameLogic.autoSaveQuiet();
				player.car.setParent( map );
				player.car.setMatrix( Pos, Ori );
				player.car.command( "setsteer -0.7" );
			} else {
				GameLogic.autoSaveQuiet();
			}

			new SfxRef( Frontend.SFX_OK ).play();
		}
		else
		if( cmd == CMD_LOCK_CAR )
		{
			new SfxRef( sound:0x0017r ).play();
			player.car.command( "setsteer -0.7" );
			player.car.command( "stop" );
		}
		else
		if( cmd == CMD_RELASE_CAR )
		{
			if( ClutchStatus == 1 )
			{
				new SfxRef( sound:0x0018r ).play();
				player.car.command( "start" ); 
				player.car.wakeUp();
				player.car.command( "setsteer -0.7" );

				ClutchStatus = 0;
				ClutchButton.setToolTip( "Liberar Embreagem" );
				ClutchButton.changeTexture( new ResourceRef(MW_Mod:0x0093r) );
			}
			else
			{
				new SfxRef( sound:0x0017r ).play();
				player.car.command( "stop" );
				player.car.command( "setsteer -0.7" );

				ClutchStatus = 1;
				ClutchButton.setToolTip( "Liberar Embreagem" );
				ClutchButton.changeTexture( new ResourceRef(MW_Mod:0x0094r) );
			}
		}
		else
		if( cmd == CMD_JACK )
		{
			JackDamage = 0;

			if ( JackStatus == 0 )
			{
				if ( player.car )
				{
					CarVector = player.car.getPos();

					if (CarVector.x < JackPos.x+0.5 && CarVector.x > JackPos.x-0.5 && CarVector.z < JackPos.z+0.5 && CarVector.z > JackPos.z-0.6)
					{
						SFX_Loop_ID = Jack_Move_SFX.play( JackPos, 0.0, 1.0, 1.0, 0 ); // SFX Move

						player.car.wakeUp();

						JackArm.setMatrix(new Vector3(JackPos), null );
						JackPhys.setMatrix(new Vector3(0.0, -3, 0.0), null ); // Place static phys under track

						JackVeh = new Vehicle( map, MW_Mod:0x0041r, 6, 2.0, 0.0, 1.0, 1.0 );
						JackVeh.setMatrix(new Vector3(JackPos), null ); // up pos

						JackVeh.setMatrix(new Vector3(JackPos.x, JackPos.y + 17.5, JackPos.z), null ); // up pos
						JackVeh.command( "stop" );
						JackVeh.setMatrix(new Vector3(JackPos), null ); // down pos
						JackVeh.wakeUp();

						JackButton.changeTexture( new ResourceRef( MW_Mod:0x0039r ) ); // Jack Bussy
						JackButton.disable();

						JackStatus = 1;

						JackThread = new Thread( this, "Jack Animate Refresher" );
						JackThread.start();
					}
					else
						new WarningDialog( player.controller, Dialog.DF_MODAL|Dialog.DF_DEFAULTBG, "Informacao", "Seu carro nao esta estacionado sobre o braco do elevacar" ).display();
				}
				else
					new WarningDialog( player.controller, Dialog.DF_MODAL|Dialog.DF_DEFAULTBG, "Informacao", "Voce precisa de um carro! \n Compre um na concessionaria ou ferro velho." ).display();
			}
			if ( JackStatus == 3 )
			{
					JackButton.changeTexture( new ResourceRef( MW_Mod:0x0039r ) ); // Jack Bussy
					JackButton.disable();

					new SfxRef(MW_Mod:0x0043r).play(JackPos, 0.0, 1.0, 1.0, 0); // SFX Move Down

					JackStatus = 4;
					Vector3 CarDownVector = new Vector3 (CarVector); // get car position for Up position
					CarDownVector.y = CarMass*0.0017-0.2;
					player.car.setMatrix( new Vector3 (JackPos.x, CarDownVector.y, JackPos.z), new Ypr(CarYpr) ); // Set car Down position
					player.car.command( "stop" );
					player.car.setMatrix( new Vector3 (CarVector), new Ypr(CarYpr) ); // Set car Up position
					player.car.wakeUp();
					player.car.command( "setsteer -0.7" );
					player.car.command( "brake" );
					JackWait = System.simTime() + 2;
			}
		}
		else
		if( cmd == CMD_ENGINE )
		{
			filterEngine=2-filterEngine;
			if( player.car )
			{
				player.car.command( "filter 1 " + filterEngine );
				player.car.wakeUp();
				player.car.command( "suspend" );
			}
			mechanic.filterInventory( filterEngine, filterBody, filterRGear );
		}
		else
		if( cmd == CMD_BODY )
		{
			filterBody=2-filterBody;
			if( player.car )
			{
				player.car.command( "filter 2 " + filterBody );
				player.car.wakeUp();
				player.car.command( "suspend" );
			}
			mechanic.filterInventory( filterEngine, filterBody, filterRGear );
		}
		else
		if( cmd == CMD_RUNNING_GEAR )
		{
			filterRGear=2-filterRGear;
			if( player.car )
			{
				player.car.command( "filter 3 " + filterRGear );
				player.car.wakeUp();
				player.car.command( "suspend" );
			}
			mechanic.filterInventory( filterEngine, filterBody, filterRGear );
		}
		else
		if( cmd == CMD_CHEATMONEY )
		{
			player.money+=250000;
			refreshMoneyString();
		}
		else
		if( cmd == CMD_ROC )
		{	//RACE OF CHAMPOINS ENTRY CONDITIONS:
			int	entryFee, minRanking, maxPartsWeight;
			float minCarPrestige;

			entryFee = GameLogic.ROC_ENTRYFEE;
			minRanking = 5;
			minCarPrestige = 7.5;
			maxPartsWeight = 1000;

			float	curCarPrestige;
			if( player.car )
				curCarPrestige = player.car.getPrestige();

			int	partsWeight;
			//TODO: kiszamolni!

			int	requirements;

			if( player.money >= entryFee )
				requirements|=0x01;
			if( GameLogic.findRacer( player ) >= GameLogic.speedymen.length-minRanking )
				requirements|=0x02;
			if( curCarPrestige >= minCarPrestige )
				requirements|=0x04;
			if( partsWeight <= maxPartsWeight )
				requirements|=0x08;

			int	rocIntervalDays = 30*6;

			if( new ROCEntryDialog( player.controller, requirements, rocIntervalDays-GameLogic.day%(rocIntervalDays+1) ).display() )
			{
				GameLogic.setTime( 8*3600 );
				osdCommand( CMD_BEGIN_ROC );
			}
		}
		else
		if( cmd == CMD_BEGIN_ROC )
		{
			roc = new Roc( player );

			GameLogic.changeActiveSection( this );
		}
		else
		if( cmd == CMD_ROCINFO )
		{
			GameLogic.changeActiveSection( new RocInfo() );
		}
		else
		if( cmd == CMD_ROCRACE )
		{
			String problem = player.car.isDriveable();
			if( !problem )
				GameLogic.changeActiveSection( new ROCTrack() );
			else
				giveWarning( problem );
		}
		else
		if( cmd == CMD_ROCTEST )
		{
			String problem = player.car.isDriveable();
			if( !problem )
			{
				ROCTrack rt = new ROCTrack();
				rt.testMode = 1;
				GameLogic.changeActiveSection( rt );
			}
			else
				giveWarning( problem );
		}
		else
		if( cmd == CMD_ROCQUIT )
		{
			if( 0 == new NoYesDialog( player.controller, Dialog.DF_MODAL|Dialog.DF_DEFAULTBG, "Tem Certeza?", "Pense duas vezes: Voce so pode se inscrever na proxima Race Of Champions (daqui a 6 meses), se desistir agora! Desistir tambem degrada seriamente seu prestigio." ).display() )
			{
				GameLogic.spendTime( 8*3600+24*3600-GameLogic.getTime() );
				player.money-=GameLogic.ROC_ENTRYFEE;
				roc = null;
				player.prestige*=0.2;
				GameLogic.changeActiveSection( this );
			}
		}
		else
		if( cmd == CMD_HITTHESTREET )
		{
			SavePos = 1; // Save car position
			GameLogic.changeActiveSection( new DriverSelect(1) );
		}
		else
		if( cmd == CMD_TESTTRACK )
		{
			if( player.car )
			{
				String problem = player.car.isDriveable();
				if( !problem )
				{
					//el kell menni odaig..
					GameLogic.spendTime( 1800 );
					GameLogic.changeActiveSection( new TestTrack() );
				}
				else
					giveWarning( problem );
			}
			else
				giveWarning( "Voce precisa de um carro! \n Compre um na concessionaria ou ferro velho." );
		}
		else
		if( cmd == CMD_TRACKSELECT )
		{
			if( player.car )
			{
				String problem = player.car.isDriveable();
				if( !problem )
				{
					//el kell menni odaig..
					GameLogic.spendTime( 1800 );
					GameLogic.changeActiveSection( new TrackSelect() );
				}
				else
					giveWarning( problem );
			}
			else
				giveWarning( "Voce precisa de um carro! \n Compre um na concessionaria ou ferro velho." );

			//GameLogic.autoSaveQuiet(); // Save Game
		}
		else
		if( cmd == CMD_CARLOT )
		{
			GameLogic.changeActiveSection( player.carlot );
			//GameLogic.autoSaveQuiet(); // Save Game
		}
		else
		if( cmd == CMD_BUYCARS || cmd == CMD_BUYCARSUSED )
		{
			float hour = GameLogic.getTime() / 3600;
			if( hour > 7 && hour < 17 )
			{
				//el kell menni odaig..
				GameLogic.spendTime( 1800 );

				int used;
				float	visitTimeStamp = GameLogic.day*24+GameLogic.getTime()/3600;
				float	hoursPassed;
				VehicleDescriptor[] vds;

				if(  cmd == CMD_BUYCARSUSED )
				{
					used=1;
					vds = GameLogic.carDescriptors_Used;

					if( !GameLogic.dealerVisitTimeStamp_Used )
						GameLogic.dealerVisitTimeStamp_Used = visitTimeStamp;
					hoursPassed = visitTimeStamp-GameLogic.dealerVisitTimeStamp_Used;
					GameLogic.dealerVisitTimeStamp_Used = visitTimeStamp;
				}
				else
				{
					if( !GameLogic.dealerVisitTimeStamp_New )
						GameLogic.dealerVisitTimeStamp_New = visitTimeStamp;
					vds = GameLogic.carDescriptors_New;
					hoursPassed = visitTimeStamp-GameLogic.dealerVisitTimeStamp_New;
					GameLogic.dealerVisitTimeStamp_New = visitTimeStamp;
				}

				CarMarket.alterCars( used, vds, hoursPassed );

				if( !used && player.money < GameLogic.INITIAL_PLAYER_MONEY && !player.car && player.carlot.isEmpty() )
				{	//reset new dealer to a selection of cheap cars, when player is low on money and has no car
					GameLogic.carDescriptors_New = CarMarket.getInitialCars( 0 );
				}

						
				if( player.money < GameLogic.INITIAL_PLAYER_MONEY )
				{	//reset new dealer to a selection of cheap cars, when player is low on money
					GameLogic.carDescriptors_New = CarMarket.getInitialCars( 0 );
				}
				else
				{
				}

				GameLogic.changeActiveSection( new CarMarket( used, vds ) );
			}
			else
			{
				giveWarning( "A revendedora de carros esta fechada agora! \n Horario de funcionamento: 7h as 17h" );
			}

			//GameLogic.autoSaveQuiet(); // Save Game
		}
		else
		if( cmd == CMD_CATALOG )
		{
			SavePos = 1; // Save car position
			GameLogic.changeActiveSection( new Catalog() );
		}
		else
		if( cmd == CMD_CLUBINFO )
		{
			SavePos = 1; // Save car position
			GameLogic.changeActiveSection( new ClubInfo() );
		}
		else
		if( cmd == CMD_CARINFO )
		{
			SavePos = 1; // Save car position
			if( player.car )
				GameLogic.changeActiveSection( new CarInfo( GameLogic.player.car ) );
			else
				giveWarning( "Voce precisa de um carro! \n Compre um na concessionaria ou ferro velho." );
		}
		else
		if( cmd == CMD_TIME )
		{
			GameLogic.spendTime( 3600 );
			player.prestige-=0.00333/24.0;	//1 napi tekeres -1 prestige point
		}
		else
		if( cmd == CMD_TIME_6H )
		{
			GameLogic.spendTime( 21600 );
			player.prestige-=0.01998/24.0;	//1 napi tekeres -1 prestige point
		}
		else
		if( cmd == CMD_MECHANIC )
		{
			changeMode(MODE_SZEREL);
		}
		else
		if( cmd == CMD_TUNE )
		{
			//mivel itt nem fut osd keychecker, nekunk kell beflusholni a keyeket a cheat-check bufferbe
			Input.flushKeys();

			int	code=GameLogic.kismajomCheck( GameLogic.kismajom );
			if( code >=0 )
			{
				new SfxRef( sound:0x0024r ).play();

				switch( code )
				{
				case 0:	//letmeroc
					osdCommand( CMD_BEGIN_ROC );
					break;
				case 1:	//money
					player.money+=1000000;
					refreshMoneyString();
					break;
				case 2:	//promotion
					if( player.club < 2 )
					{
						player.club++;
						int you = GameLogic.findRacer(player);
						GameLogic.challenge( you, player.club*20, 0, 1, 1 ); // Set position at ranking
						GameLogic.challenge( you, player.club*20, 0, 1, 0 ); // Set position at ranking
						GameLogic.changeActiveSection( this );
					}
					else
						new SfxRef( frontend:0x0081r ).play();
					break;
				case 3:	//cheating
						GameLogic.cheats = 1;
						infoline.changeText( "Cheater Safado!" );
					break;
				case 4:// timemachine
						GameLogic.day = 180;
						GameLogic.dayTxt.changeText( GameLogic.day );
					break;
				}
			}
			else
			{
				changeMode(MODE_TUNE);
			}
		}
		else
		if( cmd == CMD_PAINT )
		{
			changeMode(MODE_PAINT);
		}
	}

	//easy dialog handling:
	public void giveWarning( String title, String text )
	{
		new WarningDialog( player.controller, Dialog.DF_MODAL|Dialog.DF_DEFAULTBG, title, text ).display();
	}

	public void giveWarning( String text )
	{
		giveWarning( "Aviso", text );
	}
}

//-----------------------------------------------------------------------
//-----------------------------------------------------------------------


public class ROCEntryDialog extends Dialog
{
    final static int CMD_INFO0 = 0;
    final static int CMD_INFO1 = 1;
    final static int CMD_INFO2 = 2;
    final static int CMD_INFO3 = 3;
    final static int CMD_ENTER = 4;
    final static int CMD_CANCEL= 5;

	int	reqs, daysleft;
	Controller ctrl;

    public ROCEntryDialog( Controller ctrl, int reqs, int daysleft )
    {
        super( ctrl, DF_FULLSCREEN|DF_MODAL|DF_DARKEN|DF_FREEZE, null, null );
		this.reqs = reqs;
		this.daysleft = daysleft;
		this.ctrl = ctrl;
    }

    public void show()
    {
		float top=-0.58, row0=-0.52, row1 = 0.52, step=0.14, x, y;

		//darken (igy dupla lesz!)
		osd.createRectangle( 0.0, 0.0, 2.0, 2.0, -2, Osd.RRT_DARKEN );
		osd.createRectangle( 0.0, 0.0, 1.12, 2.0, -1, new ResourceRef(frontend:0x001Er) );

		Style buttonStyle = new Style( 0.12, 0.12, Frontend.mediumFont, Text.ALIGN_CENTER, null );
		Menu m = osd.createMenu( buttonStyle, row0, top, step, Osd.MD_VERTICAL );

		m.addItem( new ResourceRef( frontend:0x00B3r ), CMD_INFO0, null );
		m.addItem( new ResourceRef( frontend:0x00B3r ), CMD_INFO1, null );
		m.addItem( new ResourceRef( frontend:0x00B3r ), CMD_INFO2, null );
		m.addItem( new ResourceRef( frontend:0x00B3r ), CMD_INFO3, null );

        x=row1; y=top;
		ResourceRef icon;
		if( reqs & 0x02 ) icon = new ResourceRef(Osd.RID_OK); else icon = new ResourceRef(Osd.RID_CANCEL);
		osd.createRectangle( x, y, 0.1, 0.1, 1.0, 0.0, 0.0, 0, icon );    y+=step;
		if( reqs & 0x04 ) icon = new ResourceRef(Osd.RID_OK); else icon = new ResourceRef(Osd.RID_CANCEL);
		osd.createRectangle( x, y, 0.1, 0.1, 1.0, 0.0, 0.0, 0, icon );    y+=step;
		if( reqs & 0x01 ) icon = new ResourceRef(Osd.RID_OK); else icon = new ResourceRef(Osd.RID_CANCEL);
		osd.createRectangle( x, y, 0.1, 0.1, 1.0, 0.0, 0.0, 0, icon );    y+=step;
		if( reqs & 0x08 ) icon = new ResourceRef(Osd.RID_OK); else icon = new ResourceRef(Osd.RID_CANCEL);
		osd.createRectangle( x, y, 0.1, 0.1, 1.0, 0.0, 0.0, 0, icon );    y+=step;

		m = osd.createMenu( buttonStyle, -0.4, 0.82, 0.8, Osd.MD_HORIZONTAL );
		Gadget g = m.addItem( new ResourceRef( Osd.RID_OK ), CMD_ENTER, "Entrar na ROC" );
		m.addItem( new ResourceRef( Osd.RID_CANCEL ), CMD_CANCEL, "Voltar a Garagem" );
	
		if( GameLogic.cheats )
		{
			m = osd.createMenu( buttonStyle, -0.94, 0.9, 0.1, Osd.MD_HORIZONTAL );
			m.addItem( new ResourceRef( Osd.RID_OK ), CMD_ENTER, "[CHEAT] Jaguaras sempre entram na ROC" );
		}

		if( daysleft )
			osd.createText( "Apenas " + daysleft + " Dias Restantes!", Frontend.mediumFont, Text.ALIGN_CENTER, 0.0, 0.80);
		else
			osd.createText( "Grande Dia da Race Of Champions! Inscreva-se Ja!", Frontend.mediumFont, Text.ALIGN_CENTER, 0.0, 0.80);

		if( reqs != 0x0F )
			g.disable();


		osd.createHotkey( Input.AXIS_CANCEL, Input.VIRTUAL, CMD_CANCEL, this );

        super.show();
    }

    public void osdCommand( int cmd )
    {
        if (cmd == CMD_INFO0)
			info("Voce deve estar entre os jogadores mais bem classificados. \n Esteja entre os cinco primeiros do Clube: Chama Vermelha e você poderá participar da R.O.C.");
		else if (cmd == CMD_INFO1)
			info("Traga um carro altamente ajustado e respeitado. Seu carro deve ter pelo menos 750 pontos de prestígio.");
		else if (cmd == CMD_INFO2)
			info("Junte a taxa de inscricao: $100000. Você receberá serviços gratuitos de reparo e ajuste por esta taxa.");
		else if (cmd == CMD_INFO3)
			info("O peso total do seu estoque de pecas está limitado a 1 Tonelada. \n Nao se esqueça de trazer pneus sobressalentes suficientes e N2O.");
        if( cmd == CMD_CANCEL )
        {
			result = 0;
			notify();
        }
        else
        if( cmd == CMD_ENTER )
        {
			result = 1;
			if( daysleft != 0 )
			{
				if( 1 == new YesNoDialog( ctrl, Dialog.DF_MODAL|Dialog.DF_DEFAULTBG|Dialog.DF_HIGHPRI, "ROC", "Faltam " + daysleft + " dias para a proxima Race of Champions. \n Deseja pular os dias restantes?" ).display() )
					result = 0;
				else
				{
					//roc day, reggel 8 ora!
					GameLogic.spendTime( daysleft*24*3600-GameLogic.getTime()+8*3600 );
				}
			}
			notify();
        }
    }

	public void info( String i )
	{
		new WarningDialog( controller, Dialog.DF_MODAL|Dialog.DF_DEFAULTBG|Dialog.DF_HIGHPRI, "INFO", i ).display();
	}
}
//-------------------------------------------------------------------------------------------------

public class Animater implements Runnable
{

}
