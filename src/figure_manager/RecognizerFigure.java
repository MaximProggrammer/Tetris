package figure_manager;

public class RecognizerFigure {

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
}
