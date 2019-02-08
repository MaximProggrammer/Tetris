package figure_manager;

import java.util.Random;

public class FigureManager {

    public int[][] figures(Figures figures) {
        int[][] figure = new int[5][4];

        switch (figures){
            case I:
                figure[0][0] = 90; figure[0][1] = 30; figure[0][2] = 30; figure[0][3] = 30;
                figure[1][0] = 120; figure[1][1] = 30; figure[1][2] = 30; figure[1][3] = 30;
                figure[2][0] = 150; figure[2][1] = 30; figure[2][2] = 30; figure[2][3] = 30;
                figure[3][0] = 180; figure[3][1] = 30; figure[3][2] = 30; figure[3][3] = 30;
                figure[4][0] = 0; figure[4][1] = 255; figure[4][2] = 255;
                break;
            case J:
                figure[0][0] = 120; figure[0][1] = 30; figure[0][2] = 30; figure[0][3] = 30;
                figure[1][0] = 150; figure[1][1] = 30; figure[1][2] = 30; figure[1][3] = 30;
                figure[2][0] = 180; figure[2][1] = 30; figure[2][2] = 30; figure[2][3] = 30;
                figure[3][0] = 180; figure[3][1] = 0; figure[3][2] = 30; figure[3][3] = 30;
                figure[4][0] = 0; figure[4][1] = 0; figure[4][2] = 255;
                break;
            case L:
                figure[0][0] = 120; figure[0][1] = 30; figure[0][2] = 30; figure[0][3] = 30;
                figure[1][0] = 150; figure[1][1] = 30; figure[1][2] = 30; figure[1][3] = 30;
                figure[2][0] = 180; figure[2][1] = 30; figure[2][2] = 30; figure[2][3] = 30;
                figure[3][0] = 120; figure[3][1] = 60; figure[3][2] = 30; figure[3][3] = 30;
                figure[4][0] = 255; figure[4][1] = 165; figure[4][2] = 0;
                break;
            case O:
                figure[0][0] = 120; figure[0][1] = 30; figure[0][2] = 30; figure[0][3] = 30;
                figure[1][0] = 150; figure[1][1] = 30; figure[1][2] = 30; figure[1][3] = 30;
                figure[2][0] = 120; figure[2][1] = 0; figure[2][2] = 30; figure[2][3] = 30;
                figure[3][0] = 150; figure[3][1] = 0; figure[3][2] = 30; figure[3][3] = 30;
                figure[4][0] = 255; figure[4][1] = 255; figure[4][2] = 0;
                break;
            case S:
                figure[0][0] = 150; figure[0][1] = 30; figure[0][2] = 30; figure[0][3] = 30;
                figure[1][0] = 180; figure[1][1] = 30; figure[1][2] = 30; figure[1][3] = 30;
                figure[2][0] = 120; figure[2][1] = 0; figure[2][2] = 30; figure[2][3] = 30;
                figure[3][0] = 150; figure[3][1] = 0; figure[3][2] = 30; figure[3][3] = 30;
                figure[4][0] = 0; figure[4][1] = 128; figure[4][2] = 0;
                break;
            case T:
                figure[0][0] = 150; figure[0][1] = 30; figure[0][2] = 30; figure[0][3] = 30;
                figure[1][0] = 180; figure[1][1] = 30; figure[1][2] = 30; figure[1][3] = 30;
                figure[2][0] = 120; figure[2][1] = 30; figure[2][2] = 30; figure[2][3] = 30;
                figure[3][0] = 150; figure[3][1] = 0; figure[3][2] = 30; figure[3][3] = 30;
                figure[4][0] = 128; figure[4][1] = 0; figure[4][2] = 128;
                break;
            case Z:
                figure[0][0] = 150; figure[0][1] = 30; figure[0][2] = 30; figure[0][3] = 30;
                figure[1][0] = 180; figure[1][1] = 0; figure[1][2] = 30; figure[1][3] = 30;
                figure[2][0] = 120; figure[2][1] = 30; figure[2][2] = 30; figure[2][3] = 30;
                figure[3][0] = 150; figure[3][1] = 0; figure[3][2] = 30; figure[3][3] = 30;
                figure[4][0] = 255; figure[4][1] = 0; figure[4][2] = 0;
                break;
            case I2:
                figure[0][0] = 120; figure[0][1] = 30; figure[0][2] = 30; figure[0][3] = 30;
                figure[1][0] = 120; figure[1][1] = 60; figure[1][2] = 30; figure[1][3] = 30;
                figure[2][0] = 120; figure[2][1] = 90; figure[2][2] = 30; figure[2][3] = 30;
                figure[3][0] = 120; figure[3][1] = 120; figure[3][2] = 30; figure[3][3] = 30;
                figure[4][0] = 0; figure[4][1] = 255; figure[4][2] = 255;
                break;
            case J2:
                figure[0][0] = 180; figure[0][1] = 30; figure[0][2] = 30; figure[0][3] = 30;
                figure[1][0] = 180; figure[1][1] = 60; figure[1][2] = 30; figure[1][3] = 30;
                figure[2][0] = 180; figure[2][1] = 90; figure[2][2] = 30; figure[2][3] = 30;
                figure[3][0] = 210; figure[3][1] = 90; figure[3][2] = 30; figure[3][3] = 30;
                figure[4][0] = 0; figure[4][1] = 0; figure[4][2] = 255;
                break;
            case L2:
                figure[0][0] = 180; figure[0][1] = 30; figure[0][2] = 30; figure[0][3] = 30;
                figure[1][0] = 180; figure[1][1] = 60; figure[1][2] = 30; figure[1][3] = 30;
                figure[2][0] = 180; figure[2][1] = 90; figure[2][2] = 30; figure[2][3] = 30;
                figure[3][0] = 150; figure[3][1] = 30; figure[3][2] = 30; figure[3][3] = 30;
                figure[4][0] = 255; figure[4][1] = 165; figure[4][2] = 0;
                break;
            case O2:
                figure[0][0] = 120; figure[0][1] = 30; figure[0][2] = 30; figure[0][3] = 30;
                figure[1][0] = 150; figure[1][1] = 30; figure[1][2] = 30; figure[1][3] = 30;
                figure[2][0] = 120; figure[2][1] = 0; figure[2][2] = 30; figure[2][3] = 30;
                figure[3][0] = 150; figure[3][1] = 0; figure[3][2] = 30; figure[3][3] = 30;
                figure[4][0] = 255; figure[4][1] = 255; figure[4][2] = 0;
                break;
            case S2:
                figure[0][0] = 150; figure[0][1] = 30; figure[0][2] = 30; figure[0][3] = 30;
                figure[1][0] = 180; figure[1][1] = 60; figure[1][2] = 30; figure[1][3] = 30;
                figure[2][0] = 180; figure[2][1] = 90; figure[2][2] = 30; figure[2][3] = 30;
                figure[3][0] = 150; figure[3][1] = 60; figure[3][2] = 30; figure[3][3] = 30;
                figure[4][0] = 0; figure[4][1] = 128; figure[4][2] = 0;
                break;
            case T2:
                figure[0][0] = 150; figure[0][1] = 60; figure[0][2] = 30; figure[0][3] = 30;
                figure[1][0] = 180; figure[1][1] = 60; figure[1][2] = 30; figure[1][3] = 30;
                figure[2][0] = 150; figure[2][1] = 30; figure[2][2] = 30; figure[2][3] = 30;
                figure[3][0] = 150; figure[3][1] = 90; figure[3][2] = 30; figure[3][3] = 30;
                figure[4][0] = 128; figure[4][1] = 0; figure[4][2] = 128;
                break;
            case Z2:
                figure[0][0] = 180; figure[0][1] = 30; figure[0][2] = 30; figure[0][3] = 30;
                figure[1][0] = 150; figure[1][1] = 60; figure[1][2] = 30; figure[1][3] = 30;
                figure[2][0] = 180; figure[2][1] = 60; figure[2][2] = 30; figure[2][3] = 30;
                figure[3][0] = 150; figure[3][1] = 90; figure[3][2] = 30; figure[3][3] = 30;
                figure[4][0] = 255; figure[4][1] = 0; figure[4][2] = 0;
                break;
            case I3:
                figure[0][0] = 120; figure[0][1] = 30; figure[0][2] = 30; figure[0][3] = 30;
                figure[1][0] = 90; figure[1][1] = 30; figure[1][2] = 30; figure[1][3] = 30;
                figure[2][0] = 60; figure[2][1] = 30; figure[2][2] = 30; figure[2][3] = 30;
                figure[3][0] = 30; figure[3][1] = 30; figure[3][2] = 30; figure[3][3] = 30;
                figure[4][0] = 0; figure[4][1] = 255; figure[4][2] = 255;
                break;
            case J3:
                figure[0][0] = 120; figure[0][1] = 60; figure[0][2] = 30; figure[0][3] = 30;
                figure[1][0] = 150; figure[1][1] = 60; figure[1][2] = 30; figure[1][3] = 30;
                figure[2][0] = 120; figure[2][1] = 90; figure[2][2] = 30; figure[2][3] = 30;
                figure[3][0] = 180; figure[3][1] = 60; figure[3][2] = 30; figure[3][3] = 30;
                figure[4][0] = 0; figure[4][1] = 0; figure[4][2] = 255;
                break;
            case L3:
                figure[0][0] = 120; figure[0][1] = 60; figure[0][2] = 30; figure[0][3] = 30;
                figure[1][0] = 150; figure[1][1] = 60; figure[1][2] = 30; figure[1][3] = 30;
                figure[2][0] = 180; figure[2][1] = 30; figure[2][2] = 30; figure[2][3] = 30;
                figure[3][0] = 180; figure[3][1] = 60; figure[3][2] = 30; figure[3][3] = 30;
                figure[4][0] = 255; figure[4][1] = 165; figure[4][2] = 0;
                break;
            case O3:
                figure[0][0] = 120; figure[0][1] = 30; figure[0][2] = 30; figure[0][3] = 30;
                figure[1][0] = 150; figure[1][1] = 30; figure[1][2] = 30; figure[1][3] = 30;
                figure[2][0] = 120; figure[2][1] = 0; figure[2][2] = 30; figure[2][3] = 30;
                figure[3][0] = 150; figure[3][1] = 0; figure[3][2] = 30; figure[3][3] = 30;
                figure[4][0] = 255; figure[4][1] = 255; figure[4][2] = 0;
                break;
            case S3:
                figure[0][0] = 150; figure[0][1] = 30; figure[0][2] = 30; figure[0][3] = 30;
                figure[1][0] = 180; figure[1][1] = 30; figure[1][2] = 30; figure[1][3] = 30;
                figure[2][0] = 120; figure[2][1] = 0; figure[2][2] = 30; figure[2][3] = 30;
                figure[3][0] = 150; figure[3][1] = 0; figure[3][2] = 30; figure[3][3] = 30;
                figure[4][0] = 0; figure[4][1] = 128; figure[4][2] = 0;
                break;
            case T3:
                figure[0][0] = 150; figure[0][1] = 60; figure[0][2] = 30; figure[0][3] = 30;
                figure[1][0] = 180; figure[1][1] = 60; figure[1][2] = 30; figure[1][3] = 30;
                figure[2][0] = 120; figure[2][1] = 60; figure[2][2] = 30; figure[2][3] = 30;
                figure[3][0] = 150; figure[3][1] = 90; figure[3][2] = 30; figure[3][3] = 30;
                figure[4][0] = 128; figure[4][1] = 0; figure[4][2] = 128;
                break;
            case Z3:
                figure[0][0] = 150; figure[0][1] = 30; figure[0][2] = 30; figure[0][3] = 30;
                figure[1][0] = 180; figure[1][1] = 0; figure[1][2] = 30; figure[1][3] = 30;
                figure[2][0] = 120; figure[2][1] = 30; figure[2][2] = 30; figure[2][3] = 30;
                figure[3][0] = 150; figure[3][1] = 0; figure[3][2] = 30; figure[3][3] = 30;
                figure[4][0] = 255; figure[4][1] = 0; figure[4][2] = 0;
                break;
            case I4:
                figure[0][0] = 120; figure[0][1] = 30; figure[0][2] = 30; figure[0][3] = 30;
                figure[1][0] = 120; figure[1][1] = 60; figure[1][2] = 30; figure[1][3] = 30;
                figure[2][0] = 120; figure[2][1] = 90; figure[2][2] = 30; figure[2][3] = 30;
                figure[3][0] = 120; figure[3][1] = 120; figure[3][2] = 30; figure[3][3] = 30;
                figure[4][0] = 0; figure[4][1] = 255; figure[4][2] = 255;
                break;
            case J4:
                figure[0][0] = 180; figure[0][1] = 30; figure[0][2] = 30; figure[0][3] = 30;
                figure[1][0] = 180; figure[1][1] = 60; figure[1][2] = 30; figure[1][3] = 30;
                figure[2][0] = 180; figure[2][1] = 90; figure[2][2] = 30; figure[2][3] = 30;
                figure[3][0] = 210; figure[3][1] = 30; figure[3][2] = 30; figure[3][3] = 30;
                figure[4][0] = 0; figure[4][1] = 0; figure[4][2] = 255;
                break;
            case L4:
                figure[0][0] = 180; figure[0][1] = 30; figure[0][2] = 30; figure[0][3] = 30;
                figure[1][0] = 180; figure[1][1] = 60; figure[1][2] = 30; figure[1][3] = 30;
                figure[2][0] = 180; figure[2][1] = 90; figure[2][2] = 30; figure[2][3] = 30;
                figure[3][0] = 210; figure[3][1] = 90; figure[3][2] = 30; figure[3][3] = 30;
                figure[4][0] = 255; figure[4][1] = 165; figure[4][2] = 0;
                break;
            case O4:
                figure[0][0] = 120; figure[0][1] = 30; figure[0][2] = 30; figure[0][3] = 30;
                figure[1][0] = 150; figure[1][1] = 30; figure[1][2] = 30; figure[1][3] = 30;
                figure[2][0] = 120; figure[2][1] = 0; figure[2][2] = 30; figure[2][3] = 30;
                figure[3][0] = 150; figure[3][1] = 0; figure[3][2] = 30; figure[3][3] = 30;
                figure[4][0] = 255; figure[4][1] = 255; figure[4][2] = 0;
                break;
            case S4:
                figure[0][0] = 150; figure[0][1] = 30; figure[0][2] = 30; figure[0][3] = 30;
                figure[1][0] = 180; figure[1][1] = 60; figure[1][2] = 30; figure[1][3] = 30;
                figure[2][0] = 180; figure[2][1] = 90; figure[2][2] = 30; figure[2][3] = 30;
                figure[3][0] = 150; figure[3][1] = 60; figure[3][2] = 30; figure[3][3] = 30;
                figure[4][0] = 0; figure[4][1] = 128; figure[4][2] = 0;
                break;
            case T4:
                figure[0][0] = 150; figure[0][1] = 60; figure[0][2] = 30; figure[0][3] = 30;
                figure[1][0] = 120; figure[1][1] = 60; figure[1][2] = 30; figure[1][3] = 30;
                figure[2][0] = 150; figure[2][1] = 30; figure[2][2] = 30; figure[2][3] = 30;
                figure[3][0] = 150; figure[3][1] = 90; figure[3][2] = 30; figure[3][3] = 30;
                figure[4][0] = 128; figure[4][1] = 0; figure[4][2] = 128;
                break;
            case Z4:
                figure[0][0] = 180; figure[0][1] = 30; figure[0][2] = 30; figure[0][3] = 30;
                figure[1][0] = 150; figure[1][1] = 60; figure[1][2] = 30; figure[1][3] = 30;
                figure[2][0] = 180; figure[2][1] = 60; figure[2][2] = 30; figure[2][3] = 30;
                figure[3][0] = 150; figure[3][1] = 90; figure[3][2] = 30; figure[3][3] = 30;
                figure[4][0] = 255; figure[4][1] = 0; figure[4][2] = 0;
                break;
        }

        return figure;
    }

    public Figures recognizer(Figures figure) {
        switch (figure){
            case I:
                figure = Figures.I2;
                break;
            case I2:
                figure = Figures.I3;
                break;
            case I3:
                figure = Figures.I4;
                break;
            case I4:
                figure = Figures.I;
                break;
            case J:
                figure = Figures.J2;
                break;
            case J2:
                figure = Figures.J3;
                break;
            case J3:
                figure = Figures.J4;
                break;
            case J4:
                figure = Figures.J;
                break;
            case L:
                figure = Figures.L2;
                break;
            case L2:
                figure = Figures.L3;
                break;
            case L3:
                figure = Figures.L4;
                break;
            case L4:
                figure = Figures.L;
                break;
            case O:
                figure = Figures.O2;
                break;
            case O2:
                figure = Figures.O3;
                break;
            case O3:
                figure = Figures.O4;
                break;
            case O4:
                figure = Figures.O;
                break;
            case S:
                figure = Figures.S2;
                break;
            case S2:
                figure = Figures.S3;
                break;
            case S3:
                figure = Figures.S4;
                break;
            case S4:
                figure = Figures.S;
                break;
            case T:
                figure = Figures.T2;
                break;
            case T2:
                figure = Figures.T3;
                break;
            case T3:
                figure = Figures.T4;
                break;
            case T4:
                figure = Figures.T;
                break;
            case Z:
                figure = Figures.Z2;
                break;
            case Z2:
                figure = Figures.Z3;
                break;
            case Z3:
                figure = Figures.Z4;
                break;
            case Z4:
                figure = Figures.Z;
                break;
        }


        return figure;
    }

    public Figures createNewFigure(){
        Figures figure = Figures.I;
        int i = new Random().nextInt(8);

        switch (i) {
            case 0:
                figure = Figures.I;
                break;
            case 1:
                figure = Figures.J;
                break;
            case 2:
                figure = Figures.L;
                break;
            case 3:
                figure = Figures.O;
                break;
            case 4:
                figure = Figures.S;
                break;
            case 5:
                figure = Figures.T;
                break;
            case 6:
                figure = Figures.Z;
                break;
        }

        return figure;
    }

    public boolean[] checkFigure(Figures figure){
        boolean thisFigure[] = new boolean[2];
        thisFigure[1] = false;

        switch (figure){
            case S:
                thisFigure[0] = true;
                break;
            case S3:
                thisFigure[0] = true;
                break;
            case Z:
                thisFigure[0] = true;
                break;
            case Z3:
                thisFigure[0] = true;
                break;
            case T:
                thisFigure[0] = true;
                break;
            case T3:
                thisFigure[1] = true;
                break;
            case J:
                thisFigure[0] = true;
                break;
            case J3:
                thisFigure[1] = true;
                break;
            case O:
                thisFigure[0] = true;
                break;
            case O2:
                thisFigure[0] = true;
                break;
            case O3:
                thisFigure[0] = true;
                break;
            case O4:
                thisFigure[0] = true;
                break;
        }


        return thisFigure;
    }
}
