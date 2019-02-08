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
    private Mesh mesh;
    private Figures figures;
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
        figures = Figures.Z;
        figure = fm.figures(figures);
        timer = new Timer(500, this);
        mesh = new Mesh(19, 11);

        x = figure[0][0];
        y = figure[0][1];

        for (int i = 0; i < mesh.getColCount(); i++)
            mesh.setCellValue(18, i, true);

        timer.start();
    }

    public void checkCollision() {
        if (y == 255) {

            int i = new Random().nextInt(8);
            figures = fm.createNewFigure(i);
            figure = fm.figures(figures);

            x = figure[0][0];
            y = figure[0][1];
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

        g.setColor(new Color(figure[4][0], figure[4][1], figure[4][2]));
        g.fillRect(x + (x - figure[0][0]), y + (y - figure[0][1]), figure[0][2], figure[0][3]);
        g.fillRect(x + (x - figure[1][0]), y + (y - figure[1][1]), figure[1][2], figure[1][3]);
        g.fillRect(x + (x - figure[2][0]), y + (y - figure[2][1]), figure[2][2], figure[2][3]);
        g.fillRect(x + (x - figure[3][0]), y + (y - figure[3][1]), figure[3][2], figure[3][3]);


        int cellWidth = getWidth() / mesh.getColCount();
        int cellHeight = getHeight() / mesh.getRowCount();

        int h = 0, w = 0;

        for (int row = 0; row < mesh.getRowCount(); row++) {
            for (int col = 0; col < mesh.getColCount(); col++) {
                if (mesh.getValue(row, col)) {
                    g.setColor(Color.white);
                    g.fillRect(w, h, cellWidth, cellHeight);
                }

                g.setColor(Color.black);
                g.drawRect(w, h, cellWidth, cellHeight);

                w += cellWidth;
            }
            h += cellHeight;
            w = 0;
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

            if (key == KeyEvent.VK_UP) {
                figures = fm.recognizer(figures);
                figure = fm.figures(figures);
            }


        }
    }

}