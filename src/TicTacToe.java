import java.util.Locale;

public class TicTacToe {
    private boolean isGame;
    private String[][] gameField;
    private boolean isXMotion = true;

    public TicTacToe() {
        newGame();
    }

    private int directionValue(int i, int j) {
        if (gameField[i][j].equals("X")) return 10;
        else if (gameField[i][j].equals("0")) return 2;
        return 0;
    }

    public void newGame() {
        isGame = true;
        isXMotion = true;
        gameField = new String[][]{{"-", "-", "-"}, {"-", "-", "-"}, {"-", "-", "-"}};
    }

    public String[][] getField() {
        return gameField;
    }

    public String checkGame() {
        int directionSumV, directionSumG;
        int iterator = 0;
        int[] calcVariant = new int[8]; //3-vertical + 3 horizontal + 2 diagonal
        int drawIterator = 0;

        for (int i = 0; i < 3; i++) {
            directionSumV = 0;
            directionSumG = 0;
            for (int j = 0; j < 3; j++) {
                directionSumG += directionValue(i, j);
                directionSumV += directionValue(j, i);
            }
            calcVariant[iterator++] = directionSumG;
            calcVariant[iterator++] = directionSumV;
        }

        calcVariant[iterator++] = directionValue(0, 0) + directionValue(1, 1) + directionValue(2, 2);
        calcVariant[iterator++] = directionValue(0, 2) + directionValue(1, 1) + directionValue(2, 0);


        for (int j : calcVariant) {
            if (j == 6) return "0";
            if (j == 30) return "X";
            if (j > 10) drawIterator++;
        }
        if (drawIterator == calcVariant.length) return "D";
        return null;
    }

    public String makeMove(int x, int y) {
        int inX = x - 1, inY = y - 1;
        if (!isGame) return "Game was ended";
        if (! gameField[inX][inY].equals("-")) return "Cell " + x + ", " + y + " is already occupied";

        gameField[inX][inY] = "0";
        if (isXMotion) {
            gameField[inX][inY] = "X";
        }
        isXMotion = !isXMotion;

        String cG = checkGame();
        if (cG == null) return "Move completed";
        isGame = false;
        if (cG.equals("D")) return "Draw";
        return "Player " + cG+ " won";
    }
}
