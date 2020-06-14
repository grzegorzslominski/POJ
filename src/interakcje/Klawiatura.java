package interakcje;

import gra.Kierunek;
import gra.Snake;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Klawiatura implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W:
                if (!(Snake.glowa.getKierunek() == Kierunek.DOL) && !Snake.czekajNaRuch) {
                    Snake.glowa.setKierunek(Kierunek.GORA);
                    Snake.czekajNaRuch = true;
                }
                break;
            case KeyEvent.VK_A:
                if (!(Snake.glowa.getKierunek() == Kierunek.PRAWO) && !Snake.czekajNaRuch) {
                    Snake.glowa.setKierunek(Kierunek.LEWO);
                    Snake.czekajNaRuch = true;
                }
                break;
            case KeyEvent.VK_S:
                if (!(Snake.glowa.getKierunek() == Kierunek.GORA) && !Snake.czekajNaRuch) {
                    Snake.glowa.setKierunek(Kierunek.DOL);
                    Snake.czekajNaRuch = true;
                }
                break;
            case KeyEvent.VK_D:
                if (!(Snake.glowa.getKierunek() == Kierunek.LEWO) && !Snake.czekajNaRuch) {
                    Snake.glowa.setKierunek(Kierunek.PRAWO);
                    Snake.czekajNaRuch = true;
                }
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
