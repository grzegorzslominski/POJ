package gui;

import interakcje.Klawiatura;

import javax.swing.*;

public class Gui {
    JFrame jf;
    Rysuj d;

    public static int width = 800, height = 600;
    // punkt od którego zaczyna się pole gry
    public static int xoff = 130, yoff = 20;

    public void create(){
        jf = new JFrame("Snake");
        jf.setSize(width,height);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setLayout(null);
        jf.setResizable(false);
        jf.addKeyListener(new Klawiatura());

        d = new Rysuj();
        d.setBounds(0,0,width,height);
        d.setVisible(true);
        jf.add(d);

        jf.requestFocus();
        jf.setVisible(true);

    }
}
