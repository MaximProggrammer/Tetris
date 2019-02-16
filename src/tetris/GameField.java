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
    private final int DOT_SIZE = 30;
    private int x, y;
    private int[][] figure;
    private boolean inGame;
    private int score;

    public GameField() {
        setBackground(Color.BLACK);
        addKeyListener(new FieldKeyListener());
        setFocusable(true);
        initStart();
    }

    public void initStart() {
        figures = Figures.I;
        figure = fm.figures(figures);
        timer = new Timer(500, this);
        mesh = new Mesh(19, 12);
        inGame = true;
        score = 0;

        x = figure[0][0];
        y = figure[0][1];

        for (int i = 0; i < mesh.getColCount(); i++) {
            mesh.setCellValue(18, i, true);
        }

        timer.start();
    }

    public void checkCollision() {
        boolean[] thisFigure = fm.checkFigure(figures);

        if (y == 270 && thisFigure[0] != true && thisFigure[1] != true) {
            for (int i = 0; i < 4; i++) {
                int x1, y1;

                x1 = (x + (x - figure[i][0])) / DOT_SIZE;
                y1 = (y + (y - figure[i][1])) / DOT_SIZE;

                mesh.setCellValue(y1, x1, true);
            }

            figures = fm.createNewFigure();
            figure = fm.figures(figures);

            x = figure[0][0];
            y = figure[0][1];
        }

        if (y == 255 && thisFigure[0] != false && thisFigure[1] != true) {
            for (int i = 0; i < 4; i++) {
                int x1, y1;

                x1 = (x + (x - figure[i][0])) / DOT_SIZE;
                y1 = (y + (y - figure[i][1])) / DOT_SIZE;

                mesh.setCellValue(y1, x1, true);
            }

            figures = fm.createNewFigure();
            figure = fm.figures(figures);

            x = figure[0][0];
            y = figure[0][1];
        }

        if (y == 285 && thisFigure[1] != false) {
            for (int i = 0; i < 4; i++) {
                int x1, y1;

                x1 = (x + (x - figure[i][0])) / DOT_SIZE;
                y1 = (y + (y - figure[i][1])) / DOT_SIZE;

                mesh.setCellValue(y1, x1, true);
            }

            figures = fm.createNewFigure();
            figure = fm.figures(figures);

            x = figure[0][0];
            y = figure[0][1];
        }


        for (int i = 0; i < 4; i++) {
            int x1 = (x + (x - figure[i][0])) / DOT_SIZE;
            int y1 = (y + (y - figure[i][1])) / DOT_SIZE;

            if (mesh.getValue(y1 + 1, x1).equals(true)) {
                for (int j = 0; j < 4; j++) {
                    int x2 = (x + (x - figure[j][0])) / DOT_SIZE;
                    int y2 = (y + (y - figure[j][1])) / DOT_SIZE;

                    mesh.setCellValue(y2, x2, true);
                }

                figures = fm.createNewFigure();
                figure = fm.figures(figures);

                x = figure[0][0];
                y = figure[0][1];
            }
        }

        for (int i = 0; i < 4; i++) {
            int x1 = (x + (x - figure[i][0])) / DOT_SIZE;
            int y1 = (y + (y - figure[i][1])) / DOT_SIZE;

            if (mesh.getValue(y1, x1).equals(true)) {
                inGame = false;
            }
        }

        for (int i = 0; i < 4; i++) {
            int x1 = (x + (x - figure[i][0])) / DOT_SIZE;

            if (x1 < 0) {
                System.out.println("ERROR LEFT");
                x += DOT_SIZE / 2;
            }

            if (x1 > 11) {
                System.out.println("ERROR RIGHT");
                x -= DOT_SIZE / 2;
            }
        }
    }

    public void checkScore() {
        for (int i = 0; i < mesh.getRowCount() - 1; i++) {
            if (mesh.getValue(i, 0) && mesh.getValue(i, 1) && mesh.getValue(i, 2) && mesh.getValue(i, 3)) {
                if (mesh.getValue(i, 4) && mesh.getValue(i, 5) && mesh.getValue(i, 6) && mesh.getValue(i, 7)) {
                    if (mesh.getValue(i, 8) && mesh.getValue(i, 9) && mesh.getValue(i, 10) && mesh.getValue(i, 11)) {

                        for (int j = 0; j < mesh.getColCount(); j++) {
                            mesh.setCellValue(i, j, false);
                        }

                        for (int i2 = 0; i2 < mesh.getRowCount() - 1; i2 += 2) {
                            for (int j2 = 0; j2 < mesh.getColCount(); j2++) {
                                mesh.setCellValue(i2 + 1, j2, mesh.getValue(i2, j2));

                            }
                        }

                        score += 400;
                    }
                }
            }
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
        if (inGame) {
            checkCollision();
            checkScore();
            repaint();
            y += DOT_SIZE / 2;
        } else {
            timer.stop();
            System.out.println("GameOver");
        }
    }

    class FieldKeyListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            super.keyPressed(e);

            int key = e.getKeyCode();

            if (key == KeyEvent.VK_LEFT) {
                x -= DOT_SIZE / 2;
            }

            if (key == KeyEvent.VK_RIGHT) {
                x += DOT_SIZE / 2;
            }

            if (key == KeyEvent.VK_UP) {
                figures = fm.recognizer(figures);
                figure = fm.figures(figures);
            }


        }
    }

}