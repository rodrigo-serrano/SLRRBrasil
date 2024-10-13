package java.game;

import java.io.*;
import java.util.*;
import java.util.resource.*;
import java.render.*;
import java.render.osd.*;
import java.render.osd.dialog.*;

public class NightRaceDialog extends Dialog
{
    Player	player;
    Menu	m;
    int		nItems;


    public NightRaceDialog(Controller ctrl, ResourceRef[] pict, String[] texts, int[] prizeSums)
    {
        super( ctrl, DF_MODAL|DF_FULLSCREEN|DF_DARKEN|DF_FREEZE, null, null );

        osd.createBG( Osd.RRT_DARKEN );

        osd.createTextBox( " \n Os Seguintes corredores querem correr contra voce. \n Escolha um oponente! \n ", Frontend.mediumFont, Text.ALIGN_LEFT, -0.25, -0.95, 1.14, City.RRT_FRAME );

        nItems = pict.length;

        float y = -0.92 + (3 - nItems) * 0.3;

        Style butt1;
        Style butt2;

        butt1 = new Style( 1.4, 0.15, Frontend.mediumFont, Text.ALIGN_LEFT, City.RRT_FRAME );
        butt2 = new Style( 0.45, 0.12, Frontend.mediumFont, Text.ALIGN_RIGHT, Osd.RRT_TEST );

        m = osd.createMenu( butt1, -0.6, y + 0.48, 0.6 );

        for( int i = 0; i < nItems; i++ )
        {
            osd.createRectangle( -0.96 + 0.15, y + 0.29, 0.3, 0.58, 1, pict[ i ] );

            Gadget g = m.addItem(texts[i], i+1);
            if(prizeSums[i] > 0 && prizeSums[i] > GameLogic.player.money) g.disable();

            y += 0.6;
        }

        m = osd.createMenu( butt2, 1.0, 0.8, 0 );
        m.addItem( "Cancelar", nItems );

        osd.globalHandler = this;
        osd.createHotkey(Input.AXIS_CANCEL, Input.VIRTUAL, nItems, this);
    }

    public void osdCommand(int cmd)
    {
        result = cmd;
        notify();
    }
}