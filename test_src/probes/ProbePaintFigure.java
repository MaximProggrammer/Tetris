package probes;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class ProbePaintFigure {
    public static void main(String[] args) throws Exception {
        final int SIZE = 330;
        final int DOT_SIZE = 30;
        BufferedImage holst = new BufferedImage(SIZE, 600, BufferedImage.TYPE_INT_ARGB);

        {
            Graphics2D g = (Graphics2D) holst.getGraphics();

            g.setColor(Color.BLACK);
            g.fillRect(0, 0, 330, 600);

            /*

            //draw figure I
            g.setColor(Color.cyan);
            g.fillRect(90, DOT_SIZE, DOT_SIZE, DOT_SIZE);
            g.fillRect(120, DOT_SIZE, DOT_SIZE, DOT_SIZE);
            g.fillRect(150, DOT_SIZE, DOT_SIZE, DOT_SIZE);
            g.fillRect(180, DOT_SIZE, DOT_SIZE, DOT_SIZE);
            //draw figure J
            g.setColor(Color.blue);
            g.fillRect(120, DOT_SIZE * 3, DOT_SIZE, DOT_SIZE);
            g.fillRect(150, DOT_SIZE * 3, DOT_SIZE, DOT_SIZE);
            g.fillRect(180, DOT_SIZE * 3, DOT_SIZE, DOT_SIZE);
            g.fillRect(180, DOT_SIZE * 4, DOT_SIZE, DOT_SIZE);
            //draw figure L
            g.setColor(Color.orange);
            g.fillRect(120, DOT_SIZE * 6, DOT_SIZE, DOT_SIZE);
            g.fillRect(150, DOT_SIZE * 6, DOT_SIZE, DOT_SIZE);
            g.fillRect(180, DOT_SIZE * 6, DOT_SIZE, DOT_SIZE);
            g.fillRect(120, DOT_SIZE * 7, DOT_SIZE, DOT_SIZE);
            //draw figure O
            g.setColor(Color.yellow);
            g.fillRect(120, DOT_SIZE * 9, DOT_SIZE, DOT_SIZE);
            g.fillRect(150, DOT_SIZE * 9, DOT_SIZE, DOT_SIZE);
            g.fillRect(120, DOT_SIZE * 10, DOT_SIZE, DOT_SIZE);
            g.fillRect(150, DOT_SIZE * 10, DOT_SIZE, DOT_SIZE);
            //draw figure S
            g.setColor(Color.green);
            g.fillRect(150, DOT_SIZE * 12, DOT_SIZE, DOT_SIZE);
            g.fillRect(180, DOT_SIZE * 12, DOT_SIZE, DOT_SIZE);
            g.fillRect(120, DOT_SIZE * 13, DOT_SIZE, DOT_SIZE);
            g.fillRect(150, DOT_SIZE * 13, DOT_SIZE, DOT_SIZE);
            //draw figure T
            g.setColor(Color.magenta);
            g.fillRect(150, DOT_SIZE * 15, DOT_SIZE, DOT_SIZE);
            g.fillRect(180, DOT_SIZE * 15, DOT_SIZE, DOT_SIZE);
            g.fillRect(120, DOT_SIZE * 15, DOT_SIZE, DOT_SIZE);
            g.fillRect(150, DOT_SIZE * 16, DOT_SIZE, DOT_SIZE);
            //draw figure Z
            g.setColor(Color.red);
            g.fillRect(150, DOT_SIZE * 18, DOT_SIZE, DOT_SIZE);
            g.fillRect(180, DOT_SIZE * 19, DOT_SIZE, DOT_SIZE);
            g.fillRect(120, DOT_SIZE * 18, DOT_SIZE, DOT_SIZE);
            g.fillRect(150, DOT_SIZE * 19, DOT_SIZE, DOT_SIZE);

            */

            //move figure to rotate

            // figure I2
            g.setColor(Color.red);
            g.fillRect(120, DOT_SIZE, DOT_SIZE, DOT_SIZE);
            g.fillRect(120, DOT_SIZE*2, DOT_SIZE, DOT_SIZE);
            g.fillRect(120, DOT_SIZE*3, DOT_SIZE, DOT_SIZE);
            g.fillRect(120, DOT_SIZE*4, DOT_SIZE, DOT_SIZE);
            // figure I3
            g.setColor(Color.red);
            g.fillRect(120, DOT_SIZE, DOT_SIZE, DOT_SIZE);
            g.fillRect(90, DOT_SIZE, DOT_SIZE, DOT_SIZE);
            g.fillRect(60, DOT_SIZE, DOT_SIZE, DOT_SIZE);
            g.fillRect(30, DOT_SIZE, DOT_SIZE, DOT_SIZE);

            // figure J2
            g.setColor(Color.blue);
            g.fillRect(180, DOT_SIZE * 2, DOT_SIZE, DOT_SIZE);
            g.fillRect(180, DOT_SIZE * 3, DOT_SIZE, DOT_SIZE);
            g.fillRect(180, DOT_SIZE * 4, DOT_SIZE, DOT_SIZE);
            g.fillRect(150, DOT_SIZE * 4, DOT_SIZE, DOT_SIZE);
            // figure J3
            g.setColor(Color.blue);
            g.fillRect(120, DOT_SIZE * 4, DOT_SIZE, DOT_SIZE);
            g.fillRect(150, DOT_SIZE * 4, DOT_SIZE, DOT_SIZE);
            g.fillRect(120, DOT_SIZE * 3, DOT_SIZE, DOT_SIZE);
            g.fillRect(180, DOT_SIZE * 4, DOT_SIZE, DOT_SIZE);
            // figure J4
            g.setColor(Color.blue);
            g.fillRect(180, DOT_SIZE * 2, DOT_SIZE, DOT_SIZE);
            g.fillRect(180, DOT_SIZE * 3, DOT_SIZE, DOT_SIZE);
            g.fillRect(180, DOT_SIZE * 4, DOT_SIZE, DOT_SIZE);
            g.fillRect(210, DOT_SIZE * 2, DOT_SIZE, DOT_SIZE);
            // figure L2
            g.setColor(Color.orange);
            g.fillRect(180, DOT_SIZE * 2, DOT_SIZE, DOT_SIZE);
            g.fillRect(180, DOT_SIZE * 3, DOT_SIZE, DOT_SIZE);
            g.fillRect(180, DOT_SIZE * 4, DOT_SIZE, DOT_SIZE);
            g.fillRect(150, DOT_SIZE * 2, DOT_SIZE, DOT_SIZE);
            // figure L3
            g.setColor(Color.orange);
            g.fillRect(120, DOT_SIZE * 4, DOT_SIZE, DOT_SIZE);
            g.fillRect(150, DOT_SIZE * 4, DOT_SIZE, DOT_SIZE);
            g.fillRect(180, DOT_SIZE * 3, DOT_SIZE, DOT_SIZE);
            g.fillRect(180, DOT_SIZE * 4, DOT_SIZE, DOT_SIZE);
            // figure L4
            g.setColor(Color.orange);
            g.fillRect(180, DOT_SIZE * 2, DOT_SIZE, DOT_SIZE);
            g.fillRect(180, DOT_SIZE * 3, DOT_SIZE, DOT_SIZE);
            g.fillRect(180, DOT_SIZE * 4, DOT_SIZE, DOT_SIZE);
            g.fillRect(210, DOT_SIZE * 4, DOT_SIZE, DOT_SIZE);
            // figure S2
            g.setColor(Color.green);
            g.fillRect(150, DOT_SIZE * 11, DOT_SIZE, DOT_SIZE);
            g.fillRect(180, DOT_SIZE * 12, DOT_SIZE, DOT_SIZE);
            g.fillRect(180, DOT_SIZE * 13, DOT_SIZE, DOT_SIZE);
            g.fillRect(150, DOT_SIZE * 12, DOT_SIZE, DOT_SIZE);
            // figure T2
            g.setColor(Color.magenta);
            g.fillRect(150, DOT_SIZE * 15, DOT_SIZE, DOT_SIZE);
            g.fillRect(120, DOT_SIZE * 15, DOT_SIZE, DOT_SIZE);
            g.fillRect(150, DOT_SIZE * 14, DOT_SIZE, DOT_SIZE);
            g.fillRect(150, DOT_SIZE * 16, DOT_SIZE, DOT_SIZE);
            // figure T3
            g.setColor(Color.magenta);
            g.fillRect(150, DOT_SIZE * 15, DOT_SIZE, DOT_SIZE);
            g.fillRect(180, DOT_SIZE * 15, DOT_SIZE, DOT_SIZE);
            g.fillRect(120, DOT_SIZE * 15, DOT_SIZE, DOT_SIZE);
            g.fillRect(150, DOT_SIZE * 14, DOT_SIZE, DOT_SIZE);
            // fugure T4
            g.setColor(Color.magenta);
            g.fillRect(150, DOT_SIZE * 15, DOT_SIZE, DOT_SIZE);
            g.fillRect(180, DOT_SIZE * 15, DOT_SIZE, DOT_SIZE);
            g.fillRect(150, DOT_SIZE * 14, DOT_SIZE, DOT_SIZE);
            g.fillRect(150, DOT_SIZE * 16, DOT_SIZE, DOT_SIZE);
            // figure Z2
            g.setColor(Color.red);
            g.fillRect(180, DOT_SIZE * 17, DOT_SIZE, DOT_SIZE);
            g.fillRect(150, DOT_SIZE * 18, DOT_SIZE, DOT_SIZE);
            g.fillRect(180, DOT_SIZE * 18, DOT_SIZE, DOT_SIZE);
            g.fillRect(150, DOT_SIZE * 19, DOT_SIZE, DOT_SIZE);


            //draw field
            for (int i = 0; i < SIZE; i += DOT_SIZE) {
                g.setColor(Color.GRAY);
                for (int j = 0; j < 600; j += DOT_SIZE) {
                    g.drawLine(i, 0, i, 600);
                    g.drawLine(0, j, SIZE, j);
                }
            }
        }


        ImageIO.write(holst, "png", new File("build/holst.png"));
    }
}
