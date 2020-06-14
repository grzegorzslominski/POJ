package zegar;

import interakcje.Kolizja;
import gra.Snake;

public class ZegarGra extends Thread{
    public static boolean ruch = true;

    public void run(){
        while(ruch){
            try {
                sleep(200);
                Snake.ruch();
                Snake.czekajNaRuch = false;
                Kolizja.kolizjaZbieranyPunkt();
                if(Kolizja.kolizjaCialo()){
                    Snake.ogony.clear();
                    Snake.punkty = 0;
                }
                if(Kolizja.kolizjaSciana()){
                    Snake.ogony.clear();
                    Snake.glowa.setX(7);
                    Snake.glowa.setY(7);
                    Snake.punkty = 0;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
