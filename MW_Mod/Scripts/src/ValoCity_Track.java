package java.game;

import java.io.*;
import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.render.*;	//Text
import java.render.osd.*;	//Text
import java.sound.*;
import java.render.osd.dialog.*; //Dialog Window

import java.game.parts.*;
import java.game.parts.enginepart.*;

public class ValoCity_Track extends Track
{	
	final static String MapName = "Valo City";
	final static String MapDescription = "\n \n Bem-vindo a Valo City! \n \n Corra de Dia para ganhar prestigio e dinheiro, e a Noite para subir no ranking.";
	final static String MapAuthor = "Autor:Invictus";
	final static ResourceRef MapImage = new ResourceRef(MW_Mod:0x0053r);
	final static float	TS_Version = 1.0;

	//public ValoCity_Track()

	public void StartMap()
	{
		GameLogic.changeActiveSection( new Valocity() );
		Frontend.loadingScreen.show(new ResourceRef(Frontend:0xBB93r));
	}
}