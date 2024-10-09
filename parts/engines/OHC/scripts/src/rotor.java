package java.game.parts.aquela_turbina_zika_dimais;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.*;
import java.game.parts.bodypart.*;
import java.io.*;
import java.util.resource.*;

public class rotor extends Pulley
{    
	Thread AnimateThread;
    int installed = 0;
	
	public rotor( int id )
	{
		super( id );
		name = "Rotor da turbina Master Power NB 012 .70";
		description = "Rotor leve e balanciado para turbinas. Primeira turbina animada por Adnan54 e Gzee, por favor, nao quibe minha ideia se não puxo seu pe de noite! ";
		
		brand_new_prestige_value = 14.34;

		value = tHUF2USD(14.756);
		setMaxWear(kmToMaxWear(400000.0));

		maxRPM = 120000.0;

		inertia = kgToInertia(0.01);

		check4warnings();
		        
		AnimateThread = new Thread( this, "Animate Thread" );
        AnimateThread.start();
	}
	public void run()
    {
        while(1)
        {
            if(AnimateThread)
            {
                the_car = null;
                getCar_LocalVersion();
                
                if( the_car && GameLogic.player && GameLogic.player && GameLogic.player.car && the_car == GameLogic.player.car.chassis ) // player is using this car
                {
					if( GameLogic.player.car.chassis.getInfo( GameType.GII_CONTROLLABLE ) == 0 ) // car is controled by player/bot
					{
						if( installed == 0 )
					{
						installed = 1;
					}
					
					setSlotPos( 4, new Vector3(0,0,0), new Ypr( 0, 4*(-System.simTime())+(( Input.getInput( Input.AXIS_THROTTLE )*128))*(-System.simTime()), 0));
					}
                    if(AnimateThread) AnimateThread.sleep(35); // Wait 0.035 sec (in theory will 29 FPS)
                }
                else
                {
                    if( installed )
                    {
                        setSlotPos( 4, new Vector3(0,0,0), new Ypr(0,0,0) );
                        installed = 0;
                    }

                    if(AnimateThread) AnimateThread.sleep( 2000 ); // Wait 2 sec
                }
            }
        }
    }
}