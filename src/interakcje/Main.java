package interakcje;

import zegar.ZegarGra;
import gui.Gui;

public class Main {
    public static void main(String[] args) {
        Gui g = new Gui();
        ZegarGra gc = new ZegarGra();

        g.create();
        gc.start();
    }
}
