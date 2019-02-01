package tetris;

import figure_manager.FigureManager;
import figure_manager.Figures;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class GameField extends JPanel implements ActionListener {
    private FigureManager fm = new FigureManager();
    private Timer timer;
    private final int SIZE = 330;
    private final int DOT_SIZE = 30;
    private int x, y;
    private int[][] figure;

    public GameField() {
        setBackground(Color.BLACK);
        addKeyListener(new FieldKeyListener());
        setFocusable(true);
        initStart();
    }

    public void initStart() {
        figure = fm.figures(Figures.T);
        timer = new Timer(250, this);

        x = figure[0][0];
        y = figure[0][1];

        timer.start();
    }

    public void checkCollision() {
        if (y == 255) {
            timer.stop();

            int i = 10;
            //i = new Random().nextInt(8);

            switch (i) {
                case 0:
                    figure = fm.figures(Figures.I);
                    break;
                case 1:
                    figure = fm.figures(Figures.J);
                    break;
                case 2:
                    figure = fm.figures(Figures.L);
                    break;
                case 3:
                    figure = fm.figures(Figures.O);
                    break;
                case 4:
                    figure = fm.figures(Figures.S);
                    break;
                case 5:
                    figure = fm.figures(Figures.T);
                    break;
                case 6:
                    figure = fm.figures(Figures.Z);
                    break;
            }

            //x = figure[0][0];
            //y = figure[0][1];
        }

        if (x > 210) {
            x = 210;
        }

        if (x < 90) {
            x = 90;
        }
    }

    public void paint(Graphics g) {
        super.paint(g);

        //draw figure
        g.setColor(new Color(figure[4][0],figure[4][1],figure[4][2]));
        g.fillRect(x + (x - figure[0][0]), y + (y - figure[0][1]), figure[0][2], figure[0][3]);
        g.fillRect(x + (x - figure[1][0]), y + (y - figure[1][1]), figure[1][2], figure[1][3]);
        g.fillRect(x + (x - figure[2][0]), y + (y - figure[2][1]), figure[2][2], figure[2][3]);
        g.fillRect(x + (x - figure[3][0]), y + (y - figure[3][1]), figure[3][2], figure[3][3]);

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
        checkCollision();
        repaint();
        y += DOT_SIZE / 2;
    }

    class FieldKeyListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            super.keyPressed(e);

            int key = e.getKeyCode();

            if (key == KeyEvent.VK_LEFT) {
                x -= 30;
            }

            if (key == KeyEvent.VK_RIGHT) {
                x += 30;
            }


        }
    }

}