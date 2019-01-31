package tetris;

import figure_manager.FigureManager;
import figure_manager.Figures;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameField extends JPanel implements ActionListener {
    private FigureManager fm = new FigureManager();
    private Timer timer;
    private final int SIZE = 330;
    private final int DOT_SIZE = 30;
    private int x, y;
    private int[][] figure;

    public GameField() {
        setBackground(Color.BLACK);
        initStart();
    }

    public void initStart() {
        figure = fm.figures(Figures.Z);
        timer = new Timer(250,this);

        x = figure[0][0];
        y = figure[0][1];

        timer.start();
    }

    public void paint(Graphics g) {
        super.paint(g);

        //draw figure
        g.setColor(Color.cyan);
        g.fillRect(x +(figure[0][0] - x),y +(y - figure[0][1]),figure[0][2],figure[0][3]);
        g.fillRect(x +(figure[1][0] - x),y +(y - figure[1][1]),figure[1][2],figure[1][3]);
        g.fillRect(x +(figure[2][0] - x),y +(y - figure[2][1]),figure[2][2],figure[2][3]);
        g.fillRect(x +(figure[3][0] - x),y +(y - figure[3][1]),figure[3][2],figure[3][3]);

        //draw field
        for (int i = 0; i < SIZE; i += DOT_SIZE) {
            g.setColor(Color.GRAY);
            for (int j = 0; j < 600; j += DOT_SIZE) {
                g.drawLine(i, 0, i, 600);
                g.drawLine(0, j, SIZE, j);
            }
        }

        g.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        repaint();
        y += DOT_SIZE/2;
    }
}
