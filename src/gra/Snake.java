package gra;

import gui.Gui;

import java.awt.*;
import java.util.ArrayList;

public class Snake {

    public static  int punkty = 0, najlepszyWynik = 0;

    public static boolean czekajNaRuch = false;

    public static Glowa glowa = new Glowa(7, 7);

    public static ArrayList<Ogon> ogony = new ArrayList<>();

    public static PunktDoZabrania punktDoZabrania = new PunktDoZabrania();

    public static void dodajOgon() {
        if (ogony.size() < 1) {
            ogony.add(new Ogon(glowa.getX(), glowa.getY()));
        } else {
            ogony.add(new Ogon(ogony.get(ogony.size() - 1).x, ogony.get(ogony.size() - 1).y));
        }
    }

    public static void ruch() {
        //Ruch ogonów
        if (ogony.size() >= 2) {
            for (int i = ogony.size() - 1; i >= 1; i--) {
                if (ogony.get(i).czeka()) {
                    ogony.get(i).setCzekaj(false);
                } else {
                    ogony.get(i).setX(ogony.get(i - 1).getX());
                    ogony.get(i).setY(ogony.get(i - 1).getY());
                }
            }
        }

        //Ruch pierwszego ogona za głową
        if (ogony.size() >= 1) {
            if (ogony.get(0).czeka()) {
                ogony.get(0).setCzekaj(false);
            } else {
                ogony.get(0).setX(glowa.getX());
                ogony.get(0).setY(glowa.getY());
            }
        }

        //Ruch głowy
        switch (glowa.getKierunek()) {
            case PRAWO:
                glowa.setX(glowa.getX() + 1);
                break;
            case GORA:
                glowa.setY(glowa.getY() - 1);
                break;
            case LEWO:
                glowa.setX(glowa.getX() - 1);
                break;
            case DOL:
                glowa.setY(glowa.getY() + 1);
                break;
        }

    }

    //Koordynacja pozycji
    public static Point ptc(int x, int y) {
        Point p = new Point(0, 0);
        p.x = x * 32 + Gui.xoff;
        p.y = y * 32 + Gui.yoff;

        return p;
    }

}
