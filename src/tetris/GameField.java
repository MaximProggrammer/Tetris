package tetris;

import figure_manager.FigureManager;
import figure_manager.Figures;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

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
            timer.stop();

            int i = 10;
            //i = new Random().nextInt(8);

            switch (i) {
                case 0:
                    figures = Figures.I;
                    figure = fm.figures(figures);
                    break;
                case 1:
                    figures = Figures.J;
                    figure = fm.figures(figures);
                    break;
                case 2:
                    figures = Figures.L;
                    figure = fm.figures(figures);
                    break;
                case 3:
                    figures = Figures.O;
                    figure = fm.figures(figures);
                    break;
                case 4:
                    figures = Figures.S;
                    figure = fm.figures(figures);
                    break;
                case 5:
                    figures = Figures.T;
                    figure = fm.figures(figures);
                    break;
                case 6:
                    figures = Figures.Z;
                    figure = fm.figures(figures);
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


        int cellWidth = getWidth() / mesh.getColCount();
        int cellHeight = getHeight() / mesh.getRowCount();

        int w = 0, h = 0;

        for (int row = 0; row < mesh.getRowCount(); row++) {
            for (int col = 0; col < mesh.getColCount(); col++) {
                g.setColor(Color.red);
                if (mesh.getValue(row, col)) {
                    g.fillRect(w, h, w + cellWidth, h + cellHeight);
                }

                g.setColor(Color.black);
                g.drawRect(w, h, w + cellWidth, h + cellHeight);

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