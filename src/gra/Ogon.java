package gra;

public final class Ogon {
    int x,y;
    boolean czekaj = true;

    public Ogon(int x, int y) {
        this.x = x;
        this.y = y;
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

    public boolean czeka() {
        return czekaj;
    }

    public void setCzekaj(boolean czekaj) {
        this.czekaj = czekaj;
    }
}
