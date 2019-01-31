package probes.probe_gravity_figure;

import javax.swing.*;

public class ProbeGravityFigure {
    JFrame window = new JFrame();

    public static void main(String[] args) {
        ProbeGravityFigure pgf = new ProbeGravityFigure();
        pgf.create();
    }

    public void create(){
        window.setTitle("ProbeGravityFigure");
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(330,600);
        window.setResizable(false);
        window.setLocationRelativeTo(null);
        window.add(new GameField());
        window.setVisible(true);
    }
}

