package probes.probe_gravity_figure;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameField extends JPanel implements ActionListener {
    private final int SIZE = 330;
    private final int DOT_SIZE = 30;
    private int x = 120, y = 30;
    private Timer timer;

    public GameField() {
        setBackground(Color.BLACK);
        initStart();
    }

    public void initStart() {
        timer = new Timer(250, this);
        timer.start();
    }

    public void paint(Graphics g) {
        super.paint(g);

        //draw figure I
        g.setColor(Color.cyan);
        g.fillRect(x - 30, y, DOT_SIZE, DOT_SIZE);
        g.fillRect(x, y, DOT_SIZE, DOT_SIZE);
        g.fillRect(x + 30, y, DOT_SIZE, DOT_SIZE);
        g.fillRect(x + 60, y, DOT_SIZE, DOT_SIZE);


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
        y += DOT_SIZE;
    }
}
