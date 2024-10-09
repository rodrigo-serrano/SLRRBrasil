package java.game;

import java.io.*;
import java.util.*;
import java.util.resource.*;
import java.render.*;	//Text
import java.render.osd.*;	//Text
import java.sound.*;
import java.game.parts.*;
import java.game.parts.bodypart.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.block.*;
import java.game.parts.enginepart.slidingenginepart.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.camshaft.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.charger.*;

public class CarInfo extends GameType implements GameState
{
	// resource ID constants
	final static int  RID_CAR_BG = frontend:0x0095r;
	final static int  RID_ENGINE_BG = frontend:0x0087r;
	final static int  RID_FINANCIAL_BG = frontend:0x0097r;
	final static int  RID_RECORDS_BG = frontend:0x0096r;

	// commands
	final static int	CMD_CAR_PAGE = 1;
	final static int	CMD_ENGINE_PAGE = 2;
	final static int	CMD_FINANCIAL_PAGE = 3;
	final static int	CMD_RECORDS_PAGE = 4;
	final static int	CMD_EXIT = 5;
	final static int	CMD_SCROLL_UP = 6;
	final static int	CMD_SCROLL_DOWN = 7;

	// 408,718 - 914,292
	// -0.20, 0.40 - 0.78, -0.43
	final static float graphX = -0.885;
	final static float graphY = 0.78;
	final static float graphW = 1.775;
	final static float graphH = 1.325;
	
	float			graphRPMMin = 0.00;
	float			graphRPMMax = 10000.00;
	float			graphHPMin = 0.00;
	float			graphHPMax = 600.00;
	float			graphTorqueMin = 0.00;	//ft-lbs!!
	float			graphTorqueMax = 600.00;	//ft-lbs!!

	GameState		parentState;

	Osd				osd;

	Vehicle			car;

	int				carGroup, engineGroup, financialGroup, recordsGroup, actGroup;
	int				firstPart;
	int				nParts;

	Text[]			partText = new Text[100];
	ResourceRef		graphFont;

	public CarInfo( Vehicle car_ )
	{
		createNativeInstance();

		car=car_;
	}

	public void page( int pg )
	{
		if( actGroup != pg )
		{
			osd.hideGroup( carGroup );
			osd.hideGroup( engineGroup );
			osd.hideGroup( financialGroup );
			osd.hideGroup( recordsGroup );
			actGroup = pg;
			osd.showGroup( actGroup );
		}
	}

	public void enter( GameState prevState )
	{
		parentState=prevState;

		osd = new Osd();
		osd.globalHandler = this;

		firstPart = 0;
		nParts = 0;
		createOSDObjects();
		osd.show();

		Input.cursor.enable(1);

		setEventMask( EVENT_CURSOR );
	}

	public void exit( GameState nextState )
	{
		clearEventMask( EVENT_ANY );

		Input.cursor.enable(0);
		osd.hide();
		deleteOSDObjects();
		parentState=null;
	}

	public int wearColor( float f )
	{
		int	color;

		if( f > 1.0 )
			f = 1.0;
		if( f < 0.0 )
			f = 0.0;

		if( f >= 0.5 )
		{
			color = ((1.0 - f) * 2.0) * 0xFF;
			color = ((color & 0xFF) << 16) + 0xFF00FF00;
		}
		else
		{
			color = (f * 2.0) * 0xFF;
			color = ((color & 0xFF) << 8) + 0xFFFF0000;
		}
		return color;
	}

	public float listParts( Vehicle car, int first )
	{
		int i;
		int	iv;
		float fv;

		float totalValue;
		nParts = 0;

		if( car.iteratePartsInit() )
		{
			Part part;
			while( part = car.iterateParts() )
			{
				float value = part.currentPriceNoAttach();
				float SILfine = part.police_check_fine_value;
				if( first > 0 )
				{
					first--;
				}
				else
				{
					if( i < 100 )
					{
						partText[i++].changeText( part.name );
						fv = part.getWear();
						iv = fv * 100.0;
						partText[i].changeColor( wearColor( fv ) );
						partText[i++].changeText( iv + "%" );
						fv = part.getTear();
						iv = fv * 100.0;
						partText[i].changeColor( wearColor( fv ) );
						partText[i++].changeText( iv + "%" );
						if (SILfine>0.0)
						{
							iv = SILfine;
							partText[i++].changeText( "$" + iv );
						}
						else
							partText[i++].changeText( "" );
						iv = value;
						partText[i++].changeText( "$" + iv );
					}
				}
				totalValue += value;
				nParts++;
			}
		}

		while( i < 100 )
		{
			partText[i++].changeText( "" );
		}

		return totalValue;
	}

	public void createButtons()
	{
		osd.createRectangle( 1.01, -0.82, 1.2, 0.22, -1, new ResourceRef(frontend:0x0024r) );

		Style buttonStyle = new Style( 0.12, 0.12, Frontend.smallFont, Text.ALIGN_LEFT, null );
		Menu m = osd.createMenu( buttonStyle, 0.45, -0.82, 0, Osd.MD_HORIZONTAL );

		m.addItem( new ResourceRef( frontend:0x0124r ), CMD_CAR_PAGE, "Informacoes Gerais" );
		m.addItem( new ResourceRef( frontend:0x00B5r ), CMD_ENGINE_PAGE, "Dinamometro" );
		m.addItem( new ResourceRef( frontend:0x00B4r ), CMD_FINANCIAL_PAGE, "Informacoes Pecas" );
		m.addItem( new ResourceRef( frontend:0x0123r ), CMD_RECORDS_PAGE, "Records" );
		m.addSeparator();
		m.addSeparator();
		m.addItem( new ResourceRef( Osd.RID_BACK ), CMD_EXIT, null );

		osd.createHotkey( Input.AXIS_CANCEL, Input.VIRTUAL|Osd.HK_STATIC, CMD_EXIT, this );
	}

	public void createButtonsOLD()
	{

		osd.createRectangle( 1.38, -0.95, 1.2, 0.22, -1, new ResourceRef(frontend:0x0024r) );

		Style buttonStyle = new Style( 0.12, 0.12, Frontend.smallFont, Text.ALIGN_LEFT, null );
		Menu m = osd.createMenu( buttonStyle, 0.8, -0.95, 0, Osd.MD_HORIZONTAL );

		m.addItem( new ResourceRef( frontend:0x00B5r ), CMD_CAR_PAGE, "Informacoes gerais" );
		m.addItem( new ResourceRef( frontend:0x00B5r ), CMD_ENGINE_PAGE, "Dinamometro" );
		m.addItem( new ResourceRef( frontend:0x0123r ), CMD_RECORDS_PAGE, "Records" );
		m.addSeparator();
		m.addItem( new ResourceRef( Osd.RID_BACK ), CMD_EXIT, null );

		osd.createHotkey( Input.AXIS_CANCEL, Input.VIRTUAL|Osd.HK_STATIC, CMD_EXIT, this );
	}

	public String driveType()
	{
		int dt = car.getInfo( 52/*GII_CAR_DRIVETYPE*/ );
		if( dt == 0 )
			return "Sem Tracao";
		else if( dt == 1 )
			return "Integral";
		else if( dt == 2 )
			return "Dianteira";
		else if( dt == 3 )
			return "Traseira";
		else if( dt == 4 )
			return "4x4";
		return "?";
	}

	public String exists( int ex )
	{
		if( ex == 0 )
			return "Not exists";

		return "Exists";
	}

	public void createOSDObjects()
	{
		int		i, val, line;
		float	xpos, xpos2, xpos3, ypos, fval, gx, gy;
		String	name;

		graphFont = Frontend.smallFont;

		float fontCenter = ( (1.2*osd.createText( "", graphFont, Text.ALIGN_LEFT, 0, 0).getFontSize( graphFont ))/(Config.video_y * osd.getViewport().getHeight()) );

		Chassis chas = car.chassis;

		//-------------------------------------------------
		osd.createBG( new ResourceRef(RID_ENGINE_BG) );
		//osd.createHeader( "ENGINE SPECS" );
		createButtons();


		xpos = -0.95;
		xpos2 = -0.55;
		ypos = -0.53;
		line = 0;

		int engineInstalled;
		Block engine;
		int its_vee=0;
		int has_crank=0;
		int has_pistons=0;
		int has_heads=0;


		//megkeressuk a motorblokkot, hogy tobb adatot kapjunk
		if( car.iteratePartsInit() )
		{
			Part part;
			while( part = car.iterateParts() )
			{
				if ( part instanceof Block )
				{
					engine = part;
					if (part instanceof Block_Vee )
						its_vee = 1;
				} 
				else
				if ( part instanceof Crankshaft ) 
					has_crank = 1; 
				else
				if ( part instanceof Piston ) 
					has_pistons = 1; 
				else
				if ( part instanceof CylinderHead )
					has_heads++;
			}
		}

		int comp_ok=0;

		/*
		System.log("its_vee="+its_vee);
		System.log("has_heads="+has_heads);
		System.log("has_pistons="+has_pistons);
		System.log("comp_ok="+comp_ok);
		*/

		if (its_vee && has_heads==2)
			comp_ok=1;
		else
		if (!its_vee && has_heads==1)
			comp_ok=1;

		if (comp_ok && has_pistons)
			comp_ok=1;
		else
			comp_ok=0;

		String error_text = null;

		DynoData dyno = null;

		
		if( car.iteratePartsInit() )
		{
			Part part;
			while( part = car.iterateParts() )
			{
				if ( part instanceof Block )
				{
					engine = part;
					if (part instanceof Block_Vee )
						its_vee = 1;
				} 
				else
				if ( part instanceof Crankshaft ) 
					has_crank = 1; 
				else
				if ( part instanceof Piston ) 
					has_pistons = 1; 
				else
				if ( part instanceof CylinderHead )
					has_heads++;
			}
		}



		if (its_vee && has_heads==2)
			comp_ok=1;
		else
		if (!its_vee && has_heads==1)
			comp_ok=1;

		if (comp_ok && has_pistons)
			comp_ok=1;
		else
			comp_ok=0;

		if( engine )
		{
			if( car.iteratePartsInit() )
			{
				Part part;
				while( part = car.iterateParts() )
				{
					error_text = part.isDynoable();
					if (error_text)
						break;
				}
			}

			osd.createRectangle( -0.68, -0.12, 0.6, 1.0, -1, new ResourceRef(frontend:0x000000CBr) );
			dyno = engine.dynodata;

			osd.createText( "Peso: ", Frontend.smallFont, Text.ALIGN_LEFT, xpos, ypos, line );
			osd.createText( Float.toString(chas.getMass(), "%1.0f kg"), Frontend.smallFont, Text.ALIGN_LEFT, xpos2, ypos, line );line++;
			osd.createText( "Tracao: ", Frontend.smallFont, Text.ALIGN_LEFT, xpos, ypos, line );
			osd.createText( driveType(), Frontend.smallFont, Text.ALIGN_LEFT, xpos2, ypos, line ); line++;
			line++;
			val = dyno.cylinders;
			osd.createText( "Cilindros:", Frontend.smallFont, Text.ALIGN_LEFT, xpos, ypos, line);
			osd.createText( val, Frontend.smallFont, Text.ALIGN_LEFT, xpos2, ypos, line); line++;
			val = dyno.Displacement*1000000.0;
			osd.createText( "Cilindrada:", Frontend.smallFont, Text.ALIGN_LEFT, xpos, ypos, line);
			osd.createText( val +  " cc ", Frontend.smallFont, Text.ALIGN_LEFT, xpos2, ypos, line); line++;
			osd.createText( Float.toString(val*0.061, "%1.0f cui"), Frontend.smallFont, Text.ALIGN_LEFT, xpos2, ypos, line); line++;
			osd.createText( "Diametro:", Frontend.smallFont, Text.ALIGN_LEFT, xpos, ypos, line);
			osd.createText( Float.toString(dyno.bore*1000.0, "%1.1f mm"), Frontend.smallFont, Text.ALIGN_LEFT, xpos2, ypos, line); line++;

			osd.createText( "Curso:", Frontend.smallFont, Text.ALIGN_LEFT, xpos, ypos, line);
			if (has_crank)
				osd.createText( Float.toString(dyno.stroke*1000.0, "%1.1f mm"), Frontend.smallFont, Text.ALIGN_LEFT, xpos2, ypos, line);
			else
				osd.createText( "N/A", Frontend.smallFont, Text.ALIGN_LEFT, xpos2, ypos, line);
			line++;

			osd.createText( "Compressao:", Frontend.smallFont, Text.ALIGN_LEFT, xpos, ypos, line);
			if (comp_ok)
				osd.createText( Float.toString(dyno.Compression, "%1.1f:1"), Frontend.smallFont, Text.ALIGN_LEFT, xpos2, ypos, line);
			else
				osd.createText( "N/A", Frontend.smallFont, Text.ALIGN_LEFT, xpos2, ypos, line);
			line++;

			osd.createText( "HP/Litro:", Frontend.smallFont, Text.ALIGN_LEFT, xpos, ypos, line);
			if (error_text)
				osd.createText( "N/A", Frontend.smallFont, Text.ALIGN_LEFT, xpos2, ypos, line);
			else
				osd.createText( Float.toString(dyno.maxHP/1.256 / (dyno.Displacement*1000.0), "%1.1f"), Frontend.smallFont, Text.ALIGN_LEFT, xpos2, ypos, line);
			line++;

			osd.createText( "Kg/HP:", Frontend.smallFont, Text.ALIGN_LEFT, xpos, ypos, line);
			if (error_text)
				osd.createText( "N/A", Frontend.smallFont, Text.ALIGN_LEFT, xpos2, ypos, line);
			else
				osd.createText( Float.toString(chas.getMass()/(dyno.maxHP/1.256), "%1.3f"), Frontend.smallFont, Text.ALIGN_LEFT, xpos2, ypos, line);
			line++;

			osd.createText( "Kg/Nm:", Frontend.smallFont, Text.ALIGN_LEFT, xpos, ypos, line);
			if (error_text)
				osd.createText( "N/A", Frontend.smallFont, Text.ALIGN_LEFT, xpos2, ypos, line);
			else
				osd.createText( Float.toString(chas.getMass()/(dyno.maxTorque*0.7353), "%1.3f"), Frontend.smallFont, Text.ALIGN_LEFT, xpos2, ypos, line);
			line++;

			line++;
			val = chas.engine_rpm_idle;
			osd.createText( "Lenta:", Frontend.smallFont, Text.ALIGN_LEFT, xpos, ypos, line);
			osd.createText( val+" RPM", Frontend.smallFont, Text.ALIGN_LEFT, xpos2, ypos, line); line++;
			val = chas.RPM_limit;
			osd.createText( "Corte de Giro:", Frontend.smallFont, Text.ALIGN_LEFT, xpos, ypos, line);
			osd.createText( val+" RPM", Frontend.smallFont, Text.ALIGN_LEFT, xpos2, ypos, line); line++;
			val = dyno.maxRPM;
			osd.createText( "Ponto de Destruicao:", Frontend.smallFont, Text.ALIGN_LEFT, xpos, ypos, line);
			osd.createText( val+" RPM", Frontend.smallFont, Text.ALIGN_LEFT, xpos2, ypos, line); line++;

			line++;
			line++;

			osd.createText( "Combustivel:", Frontend.smallFont, Text.ALIGN_LEFT, xpos, ypos, line); line++;
			osd.createText( " "+dyno.fuelType, Frontend.smallFont, Text.ALIGN_LEFT, xpos, ypos, line); line++;
		}
		else
			osd.createText( "Sem Motor!", Frontend.smallFont, Text.ALIGN_LEFT, xpos, ypos, line);


		osd.hideGroup( carGroup = osd.endGroup() );

		//-------------------------------------------------
		osd.createBG( new ResourceRef(RID_ENGINE_BG) );
		//osd.createHeader( "ENGINE DYNO" );
		createButtons();


		xpos = -0.95;
		xpos2 = -0.55;
		ypos = -0.53;
		line = 0;

		if( engine )
		{
			if( car.iteratePartsInit() )
			{
				Part part;
				while( part = car.iterateParts() )
				{
					error_text = part.isDynoable();
					if (error_text)
						break;
				}
			}
			int dt = car.getInfo( 52/*GII_CAR_DRIVETYPE*/ );

			dyno = engine.dynodata;
			float hp;
			float torque;
			float realhp;
			float realhploss;
			float realhpnitro;
			float realhpnitroloss;
			float torquenitro;

			hp = dyno.getHP(4000,0)*0.001f*1.341f;
			torque = dyno.getTorque(dyno.RPM_maxHP, 0) * 0.7376;	//normal ft-lbs!!
			//realhp = torque*dyno.RPM_maxHP/5252;
			realhp = dyno.maxHP/1.256;
			realhpnitro = realhp+dyno.nitropower;

			if( dt == 1)
			{
				realhploss = realhp*0.81;
				realhpnitroloss = realhpnitro*0.81;
			}
			else
			if( dt == 2)
			{
				realhploss = realhp*0.90;
				realhpnitroloss = realhpnitro*0.81;
			}
			else
			if( dt == 3)
			{
				realhploss = realhp*0.86;
				realhpnitroloss = realhpnitro*0.81;
			}	
			if( dyno.nitro_consumption > 0 && chas.tank_nitro > 0)
			{
				osd.createText( "-" , Frontend.smallFont, Text.ALIGN_LEFT, -0.85, -0.59, line ).changeColor(0xFF00C617);
				osd.createText( "Potencia com Nitro = " + Float.toString(realhpnitro, "%1.0f hp @ ") + Float.toString(dyno.RPM_maxHP, "%1.0f rpm"), Frontend.smallFont, Text.ALIGN_LEFT, -0.83, -0.59, line ).changeColor(0xFFFFFFFF);
			}
				
			
			osd.createText( "-" , Frontend.smallFont, Text.ALIGN_LEFT, -0.85, -0.67, line ).changeColor(0xFF8080FF);
			osd.createText( "-" , Frontend.smallFont, Text.ALIGN_LEFT, -0.85, -0.63, line ).changeColor(0xFFFF8080);
			
			osd.createText( "Potencia = " + Float.toString(realhp, "%1.0f hp @ ") + Float.toString(dyno.RPM_maxHP, "%1.0f rpm"), Frontend.smallFont, Text.ALIGN_LEFT, -0.83, -0.67, line ).changeColor(0xFFFFFFFF);
			osd.createText( "Torque = " + Float.toString(dyno.maxTorque/9.807, "%1.0f Kg/m @ ") + Float.toString(dyno.RPM_maxTorque, "%1.0f rpm") , Frontend.smallFont, Text.ALIGN_LEFT, -0.83, -0.63, line ).changeColor(0xFFFFFFFF);
			
		}
		else
			osd.createText( "Sem Motor!", Frontend.smallFont, Text.ALIGN_LEFT, xpos, ypos, line);

		if (error_text)
			osd.createTextBox( "Informacao de Dinanometro Indisponivel, por "+error_text, Frontend.smallFont, Text.ALIGN_LEFT, graphX, ypos, graphW );
		else
			if (dyno)
			{
				graphRPMMin = 0.00;
				//graphRPMMax = 5000.00;
				graphHPMin = 0.00;
				graphHPMax = 100.00;
				graphTorqueMin = 0.00;		//ft-lbs!!
				graphTorqueMax = 100.00;	//ft-lbs!!

				float hptorque;
				float realhp2;
				float realhp;
				float torquenitro;
				float torq;

				hptorque = dyno.getTorque(dyno.RPM_maxHP, 0) * 0.7376;	//normal ft-lbs!!
				realhp2 = dyno.maxHP/1.256;
				realhp = realhp2+dyno.nitropower;
				torquenitro = dyno.nitropower*5252/dyno.RPM_maxHP;
				torq = dyno.maxTorque*0.7353;

				while (graphRPMMax < dyno.RPM_limit)
				{
					graphRPMMax = dyno.maxRPM;
				}

			if( dyno.nitro_consumption > 0 && chas.tank_nitro > 0)
			{
				if(realhp >= torq)
				{
					if(graphHPMax < realhp)
					{
						if( realhp > 0 && realhp <= 2000)
						{
							while( graphHPMax < realhp )
							{
								graphHPMax += 100;
								graphTorqueMax += 100;
							}
						}
						if( realhp > 2000)
						{
							while( graphHPMax < realhp )
							{
								graphHPMax += 500;
								graphTorqueMax += 500;
							}
						}
					}
				}
				if(realhp2 <= torq)
				{
					if(graphTorqueMax < torq)
					{
						if( torq > 0 && torq <= 2000)
						{
							while( graphTorqueMax < torq )
							{
								graphHPMax += 100;
								graphTorqueMax += 100;
							}
						}
						if( torq > 2000)
						{
							while( graphTorqueMax < torq )
							{
								graphHPMax += 500;
								graphTorqueMax += 500;
							}
						}
					}
				}
			}
			else
			{
				if(realhp2 >= torq)
				{
					if(graphHPMax < realhp2)
					{
						if( realhp2 > 0 && realhp2 <= 2000)
						{
							while( graphHPMax < realhp2 )
							{
								graphHPMax += 100;
								graphTorqueMax += 100;
							}
						}
						if( realhp2 > 2000)
						{
							while( graphHPMax < realhp2 )
							{
								graphHPMax += 500;
								graphTorqueMax += 500;
							}
						}
					}
				}
				if(realhp2 <= torq)
				{
					if(graphTorqueMax < torq)
					{
						if( torq > 0 && torq <= 2000)
						{
							while( graphTorqueMax < torq )
							{
								graphHPMax += 100;
								graphTorqueMax += 100;
							}
						}
						if( torq > 2000)
						{
							while( graphTorqueMax < torq )
							{
								graphHPMax += 500;
								graphTorqueMax += 500;
							}
						}
					}
				}
				
			}
				
				for (i = 1; i <= 10; i++)
				{
					gx = graphX ;
					gy = graphY - i * (graphH / 10.0) - fontCenter;
					val = i * (graphTorqueMax / 10.0);
					osd.createText( val, graphFont, Text.ALIGN_RIGHT, gx, gy).changeColor(0xFFFFFFFF);
					gx = graphX + graphW;
					val = i * (graphHPMax / 10.0);
					osd.createText( val, graphFont, Text.ALIGN_LEFT, gx, gy).changeColor(0xFFFFFFFF);
				}
				for (i = 0; i <= 10; i++) 
				{
					gx = graphX + i * (graphW / 10.0);
					gy = graphY + fontCenter;
					val = i * (graphRPMMax / 10.0);
					osd.createText( val, graphFont, Text.ALIGN_CENTER, gx, gy).changeColor(0xFFFFFFFF);
				}

				float torque;
				float hp;
				float RPM;

				RPM = graphRPMMin + 100;
				while(RPM<=graphRPMMax)
				{
					hp = dyno.getHP(RPM,0)*0.001f*1.341f/1.256;
					gx = graphX+(RPM-graphRPMMin)/(graphRPMMax-graphRPMMin)*graphW;
					gy = graphY-(hp-graphHPMin)/(graphHPMax-graphHPMin)*graphH - fontCenter;
					if (RPM <= dyno.RPM_limit) {
						osd.createText( "*", graphFont, Text.ALIGN_LEFT, gx, gy).changeColor(0xFF8080FF);	
					} else {
						osd.createText( "-", graphFont, Text.ALIGN_LEFT, gx, gy).changeColor(0xFF8080FF);
					}
					RPM += 50.0;
				}

				RPM = graphRPMMin + 100;
				while(RPM<=graphRPMMax)
				{
					torque = dyno.getTorque(RPM, 0.0) * 0.7376;
					gx = graphX+(RPM-graphRPMMin)/(graphRPMMax-graphRPMMin)*graphW;
					gy = graphY-(torque-graphTorqueMin)/(graphTorqueMax-graphTorqueMin)*graphH - fontCenter;
					if (RPM <= dyno.RPM_limit) {
						osd.createText( "*", graphFont, Text.ALIGN_LEFT, gx, gy).changeColor(0xFFFF8080);	
					} else {
						osd.createText( "-", graphFont, Text.ALIGN_LEFT, gx, gy).changeColor(0xFFFF8080);
					}
					RPM += 50.0;
				}
			
				if( dyno.nitro_consumption > 0 && chas.tank_nitro > 0)
				{
					
					RPM = graphRPMMin + 100;
					while(RPM<=graphRPMMax)
					{
						hp = dyno.getHP(RPM,0)*0.001f*1.341f/1.256+dyno.nitropower;
						gx = graphX+(RPM-graphRPMMin)/(graphRPMMax-graphRPMMin)*graphW;
						gy = graphY-(hp-graphHPMin)/(graphHPMax-graphHPMin)*graphH - fontCenter;
						if (RPM <= dyno.RPM_limit) {
							osd.createText( "*", graphFont, Text.ALIGN_LEFT, gx, gy).changeColor(0xFF00C617);	
						} else {
							osd.createText( "-", graphFont, Text.ALIGN_LEFT, gx, gy).changeColor(0xFF00C617);
						}

						RPM += 50.0;
					}
				}
			
			}

		osd.hideGroup( engineGroup = osd.endGroup() );

		//-------------------------------------------------
		osd.createBG( new ResourceRef(RID_FINANCIAL_BG) );
		osd.createHeader( "Informacao Financeira" );

		financeInfo();

		createButtons();

		

		osd.hideGroup( financialGroup = osd.endGroup() );

		//-------------------------------------------------
		osd.createBG( new ResourceRef(RID_RECORDS_BG) );
		osd.createHeader( "Records" );
		createButtons();

		records();

		osd.hideGroup( recordsGroup = osd.endGroup() );

		actGroup = -1;
		page( carGroup );
	}	

	public void deleteOSDObjects()
	{
	}

	public void records()
	{
		int		i, val, line;
		float	xpos, xpos2, xpos3, ypos, fval, gx, gy;
		String	name;
	

		Chassis chas = car.chassis;

		ypos = -0.64;
		line = 0;
		xpos2 = 0.8;
		xpos3 = -0.1;

		osd.createText( "Estatistica para "+chas.vehicleName+":", Frontend.smallFont, Text.ALIGN_LEFT, xpos, ypos, line ); line++;
		line++;

		osd.createText( "Melhor tempo Test Track:", Frontend.smallFont, Text.ALIGN_LEFT, xpos, ypos, line ); line++;

		osd.createText( " Velocidade Final:", Frontend.smallFont, Text.ALIGN_LEFT, xpos, ypos, line );
		if( car.maxTestTrackSpeedSq < 0.10 )
			osd.createText( "Nenhum", Frontend.smallFont, Text.ALIGN_RIGHT, xpos2, ypos, line );
		else
		{
			osd.createText( Float.toString(Math.sqrt( car.maxTestTrackSpeedSq ) * 2.24 * 1.61, "%1.1f KPH"), Frontend.smallFont, Text.ALIGN_RIGHT, xpos3, ypos, line );
			osd.createText( Float.toString(Math.sqrt( car.maxTestTrackSpeedSq ) * 2.24, "%1.1f MPH"), Frontend.smallFont, Text.ALIGN_RIGHT, xpos2, ypos, line );
		}
		line++;

		osd.createText( " 0-100 KM/H (0-62.1 MPH):", Frontend.smallFont, Text.ALIGN_LEFT, xpos, ypos, line );
		if( car.bestTestTrackAcc < 0.10 )
			osd.createText( "Nenhum", Frontend.smallFont, Text.ALIGN_RIGHT, xpos2, ypos, line );
		else
			osd.createText( String.timeToString( car.bestTestTrackAcc, String.TCF_NOMINUTES ), Frontend.smallFont, Text.ALIGN_RIGHT, xpos2, ypos, line);
		line++;

		osd.createText( " 0-200 KM/H (0-124.2 MPH):", Frontend.smallFont, Text.ALIGN_LEFT, xpos, ypos, line );
		if( car.bestTestTrackAcc120 < 0.10 )
			osd.createText( "Nenhum", Frontend.smallFont, Text.ALIGN_RIGHT, xpos2, ypos, line );
		else
			osd.createText( String.timeToString( car.bestTestTrackAcc120, String.TCF_NOMINUTES ), Frontend.smallFont, Text.ALIGN_RIGHT, xpos2, ypos, line );
		line++;

		osd.createText( " Tempo 402m:", Frontend.smallFont, Text.ALIGN_LEFT, xpos, ypos, line );
		if( car.bestTestTrackTime2 < 0.10 )
			osd.createText( "Nenhum", Frontend.smallFont, Text.ALIGN_RIGHT, xpos2, ypos, line );
		else
			osd.createText( String.timeToString( car.bestTestTrackTime2, String.TCF_NOMINUTES ), Frontend.smallFont, Text.ALIGN_RIGHT, xpos2, ypos, line);
		line++;

		osd.createText( " Velocidade 402m:", Frontend.smallFont, Text.ALIGN_LEFT, xpos, ypos, line );
		if( car.bestTestTrackTime2_speedSq < 0.10 )
			osd.createText( "Nenhum", Frontend.smallFont, Text.ALIGN_RIGHT, xpos2, ypos, line );
		else
		{
			osd.createText( Float.toString(Math.sqrt( car.bestTestTrackTime2_speedSq ) * 2.24 * 1.61, "%1.1f KPH"), Frontend.smallFont, Text.ALIGN_RIGHT, xpos3, ypos, line );
			osd.createText( Float.toString(Math.sqrt( car.bestTestTrackTime2_speedSq ) * 2.24, "%1.1f MPH"), Frontend.smallFont, Text.ALIGN_RIGHT, xpos2, ypos, line );
		}
		line++;

		osd.createText( " Tempo 1 Milha:", Frontend.smallFont, Text.ALIGN_LEFT, xpos, ypos, line );
		if( car.bestTestTrackTime0 < 0.10 )
			osd.createText( "Nenhum", Frontend.smallFont, Text.ALIGN_RIGHT, xpos2, ypos, line );
		else
			osd.createText( String.timeToString( car.bestTestTrackTime0, String.TCF_NOMINUTES ), Frontend.smallFont, Text.ALIGN_RIGHT, xpos2, ypos, line);
		line++;

		osd.createText( " Velocidade 1 Milha:", Frontend.smallFont, Text.ALIGN_LEFT, xpos, ypos, line );
		if( car.bestTestTrackTime0_speedSq < 0.10 )
			osd.createText( "Nenhum", Frontend.smallFont, Text.ALIGN_RIGHT, xpos2, ypos, line );
		else
		{
			osd.createText( Float.toString(Math.sqrt( car.bestTestTrackTime0_speedSq ) * 2.24 * 1.61, "%1.1f KPH"), Frontend.smallFont, Text.ALIGN_RIGHT, xpos3, ypos, line );
			osd.createText( Float.toString(Math.sqrt( car.bestTestTrackTime0_speedSq ) * 2.24, "%1.1f MPH"), Frontend.smallFont, Text.ALIGN_RIGHT, xpos2, ypos, line );
		}
		line++;

		osd.createText( " Melhor Volta:", Frontend.smallFont, Text.ALIGN_LEFT, xpos, ypos, line );
		if( car.bestTestTrackTime1 < 0.10 )
			osd.createText( "Nenhum", Frontend.smallFont, Text.ALIGN_RIGHT, xpos2, ypos, line );
		else
			osd.createText( String.timeToString( car.bestTestTrackTime1, String.TCF_NOHOURS ), Frontend.smallFont, Text.ALIGN_RIGHT, xpos2, ypos, line );
		ypos += 0.10;

		osd.createText( "Sua historia com esse carro:", Frontend.smallFont, Text.ALIGN_LEFT, xpos, ypos, line );
		line++;

		osd.createText( " Corridas:", Frontend.smallFont, Text.ALIGN_LEFT, xpos, ypos, line );
		osd.createText( car.races_won + car.races_lost, Frontend.smallFont, Text.ALIGN_RIGHT, xpos2, ypos, line ); line++;
		osd.createText( " Vitorias:", Frontend.smallFont, Text.ALIGN_LEFT, xpos, ypos, line );
		osd.createText( car.races_won, Frontend.smallFont, Text.ALIGN_RIGHT, xpos2, ypos, line ); line++;
		osd.createText( " Derrotas:", Frontend.smallFont, Text.ALIGN_LEFT, xpos, ypos, line );
		osd.createText( car.races_lost, Frontend.smallFont, Text.ALIGN_RIGHT, xpos2, ypos, line ); line++;
		osd.createText( "Historico de Prestigio:", Frontend.smallFont, Text.ALIGN_LEFT, xpos, ypos, line );
		osd.createText( Float.toString(car.getPrestigeMultiplier()*100.0, "%1.1f %%"), Frontend.smallFont, Text.ALIGN_RIGHT, xpos2, ypos, line ); line++;

		osd.createText( " Melhor Tempo 402m Noturno:", Frontend.smallFont, Text.ALIGN_LEFT, xpos, ypos, line );
		if( car.bestNightQM < 0.10 )
			osd.createText( "Nenhum", Frontend.smallFont, Text.ALIGN_RIGHT, xpos2, ypos, line );
		else
			osd.createText( String.timeToString( car.bestNightQM, String.TCF_NOMINUTES ), Frontend.smallFont, Text.ALIGN_RIGHT, xpos2, ypos, line );
		line++;
	}

	public void financeInfo()
	{
		int		i, val, line;
		float	xpos, xpos2, xpos3, ypos, fval, gx, gy;
		String	name;
	

		Chassis chas = car.chassis;

		ypos = -0.60;
		osd.createText( "Nome", Frontend.smallFont, Text.ALIGN_LEFT, -0.90, ypos);
		osd.createText( "Destruicao", Frontend.smallFont, Text.ALIGN_LEFT, 0.08, ypos);
		osd.createText( "Desgaste", Frontend.smallFont, Text.ALIGN_LEFT, 0.26, ypos);
		osd.createText( "Multas", Frontend.smallFont, Text.ALIGN_LEFT, 0.39, ypos);
		osd.createText( "Valor", Frontend.smallFont, Text.ALIGN_LEFT, 0.57, ypos);
		ypos += 0.10;

		for( i = 0; i < 100; )
		{
			partText[i] = osd.createText( "", Frontend.smallFont, Text.ALIGN_LEFT, -0.90, ypos);
			partText[i].changeColor(0xFFC0C0C0);
			i++;
			partText[i] = osd.createText( "", Frontend.smallFont, Text.ALIGN_LEFT, 0.08, ypos);
			partText[i].changeColor(0xFFC0C0C0);
			i++;
			partText[i] = osd.createText( "", Frontend.smallFont, Text.ALIGN_LEFT, 0.26, ypos);
			partText[i].changeColor(0xFFC0C0C0);
			i++;
			partText[i] = osd.createText( "", Frontend.smallFont, Text.ALIGN_RIGHT, 0.49, ypos);
			partText[i].changeColor(0xFFFF2020);
			i++;
			partText[i] = osd.createText( "", Frontend.smallFont, Text.ALIGN_RIGHT, 0.67, ypos);
			partText[i].changeColor(0xFFC0C0C0);
			i++;
			ypos+=0.05;
		}

		int totalValue = listParts( car, 0 );

		ypos += 0.05;
		osd.createText( "Valor Total", Frontend.smallFont, Text.ALIGN_LEFT, -0.90, ypos);
		osd.createText( "$" + totalValue, Frontend.smallFont, Text.ALIGN_RIGHT, 0.60, ypos);

		Style btnUp = new Style( 0.10, 0.10, 1.0, Frontend.smallFont, Text.ALIGN_CENTER, new ResourceRef( Osd.RID_ARROWUP ) );
		osd.createButton( btnUp, 0.80, -0.45, CMD_SCROLL_UP, null );

		Style btnDn = new Style( 0.10, 0.10, 1.0, Frontend.smallFont, Text.ALIGN_CENTER, new ResourceRef( Osd.RID_ARROWDN ) );
		osd.createButton( btnDn, 0.80,  0.45, CMD_SCROLL_DOWN, null );
	}

//----------------------------------------------------------------------

	public void osdCommand (int command)
	{
		if (command < 0)
			return;
		else
		if (command == CMD_CAR_PAGE)
		{
			page( carGroup );
		}
		else
		if (command == CMD_ENGINE_PAGE)
		{
			page( engineGroup );
		}
		else
		if (command == CMD_FINANCIAL_PAGE)
		{
			page( financialGroup );
		}
		else
		if (command == CMD_RECORDS_PAGE)
		{
			page( recordsGroup );
		}
		else
		if (command == CMD_EXIT)
		{
			GameLogic.changeActiveSection( parentState );
		}
		else
		if( command == CMD_SCROLL_UP )
		{
			if( firstPart > 0 )
			{
				firstPart-=20;
				if( firstPart < 0 )
					firstPart = 0;

				listParts( car, firstPart );
			}
		}
		else
		if( command == CMD_SCROLL_DOWN )
		{
			if( firstPart < nParts - 20 )
			{
				firstPart+=20;
				if( firstPart > nParts - 20 )
					firstPart = nParts - 20;

				listParts( car, firstPart );
			}
		}
	}
}
