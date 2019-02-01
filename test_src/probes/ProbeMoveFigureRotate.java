package probes;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class ProbeMoveFigureRotate {
    public static void main(String[] args) throws Exception {
        final int SIZE = 330;
        final int DOT_SIZE = 30;
        BufferedImage holst = new BufferedImage(SIZE, 600, BufferedImage.TYPE_INT_ARGB);

        {
            Graphics2D g = (Graphics2D) holst.getGraphics();

            g.setColor(Color.BLACK);
            g.fillRect(0, 0, 330, 600);

            g.setColor(Color.green);
            g.fillRect(150, 150, DOT_SIZE, DOT_SIZE);
            g.fillRect(180, 150, DOT_SIZE, DOT_SIZE);
            g.fillRect(120, 180, DOT_SIZE, DOT_SIZE);
            g.fillRect(150, 180, DOT_SIZE, DOT_SIZE);

            g.setColor(Color.green);
            g.fillRect(180, 300, DOT_SIZE, DOT_SIZE);
            g.fillRect(150+30, 300-30, DOT_SIZE, DOT_SIZE);
            g.fillRect(150, 330-60, DOT_SIZE, DOT_SIZE);
            g.fillRect(120+30, 330-90, DOT_SIZE, DOT_SIZE);

            // Написали на бумаге решение для каждой фигуры.

            //draw field
            g.setColor(Color.gray);
            for (int i = 0; i < SIZE; i += DOT_SIZE) {
                for (int j = 0; j < 600; j += DOT_SIZE) {
                    g.drawLine(i, 0, i, 600);
                    g.drawLine(0, j, SIZE, j);
                }
            }
        }


        ImageIO.write(holst, "png", new File("build/holst2.png"));
    }
}
