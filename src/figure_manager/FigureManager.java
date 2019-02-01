package figure_manager;

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
                figure[3][0] = 120; figure[3][1] = 0; figure[3][2] = 30; figure[3][3] = 30;
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
        }

        return figure;
    }
}