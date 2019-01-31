package tetris;

import figure_manager.FigureManager;

import javax.swing.*;
import java.awt.*;

public class GameField extends JPanel {
    FigureManager fm = new FigureManager();
    private final int SIZE = 330;
    private final int DOT_SIZE = 30;
    private int[][] figure;

    public GameField() {
        setBackground(Color.BLACK);
        initStart();
    }

    public void initStart() {
        figure = fm.figures();
    }

    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.cyan);
        g.fillRect(figure[0][0],figure[0][1],figure[0][2],figure[0][3]);
        g.fillRect(figure[1][0],figure[0][1],figure[0][2],figure[0][3]);
        g.fillRect(figure[2][0],figure[0][1],figure[0][2],figure[0][3]);
        g.fillRect(figure[3][0],figure[0][1],figure[0][2],figure[0][3]);

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
}
