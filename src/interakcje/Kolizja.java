package interakcje;

import gra.Snake;

public class Kolizja {

    public static boolean kolizjaCialo() {
        for(int i = 0; i<Snake.ogony.size(); i++){
            if(Snake.glowa.getX() == Snake.ogony.get(i).getX() && Snake.glowa.getY() == Snake.ogony.get(i).getY()
                    && !Snake.ogony.get(i).czeka()){
                return true;
            }

        }

        return false;
    }

    public static boolean kolizjaSciana() {

        return (Snake.glowa.getX() < 0 || Snake.glowa.getX() > 15 || Snake.glowa.getY() < 0 || Snake.glowa.getY() > 15);
    }

    public static void kolizjaZbieranyPunkt() {
        if (Snake.glowa.getX() == Snake.punktDoZabrania.getX() && Snake.glowa.getY() == Snake.punktDoZabrania.getY()) {
            Snake.punktDoZabrania.reset();
            Snake.dodajOgon();
            Snake.punkty +=1;
            if(Snake.punkty > Snake.najlepszyWynik) Snake.najlepszyWynik = Snake.punkty;

        }
    }

}
