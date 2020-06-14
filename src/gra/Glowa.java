package gra;


public class Glowa {
    Kierunek kierunek = Kierunek.PRAWO;
    int x,y;

    public Glowa(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Kierunek getKierunek() {
        return kierunek;
    }

    public void setKierunek(Kierunek dir) {
        this.kierunek = dir;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
