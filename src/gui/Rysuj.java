package gui;

import gra.Snake;

import javax.swing.*;
import java.awt.*;

public class Rysuj extends JLabel {

    Point p;

    protected void paintComponent(Graphics g) {
      ;

        //Tło
        g.setColor(Color.CYAN);
        g.fillRect(0, 0, Gui.width, Gui.height);

        //Ogon
        g.setColor(new Color(51, 204, 51));
        for (int i = 0; i < Snake.ogony.size(); i++) {
            p = Snake.ptc(Snake.ogony.get(i).getX(), Snake.ogony.get(i).getY());
            g.fillRect(p.x, p.y, 32, 32);
        }

        //Głowa
        g.setColor(new Color(0,153,0));
        p = Snake.ptc(Snake.glowa.getX(),Snake.glowa.getY());
        g.fillRect(p.x,p.y,32,32);

        //Punkt do zebrania przez węża
        g.setColor(new Color(204,51,0));
        p = Snake.ptc(Snake.punktDoZabrania.getX(), Snake.punktDoZabrania.getY());
        g.fillRect(p.x,p.y, 32,32);


        //Zewnętrzny kwadrat kratki
        g.setColor(Color.BLACK);
        g.drawRect(Gui.xoff, Gui.yoff, 512, 512);

        //Zdobyte punkty ( Aktualne i najlepszy wynik)
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Punkty: "+Snake.punkty, 5,25);
        g.drawString("Best: "+Snake.najlepszyWynik, 655,25);


        // odświeżanie się kolorów
        repaint();

    }

}
