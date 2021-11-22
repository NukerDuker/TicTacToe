import java.util.Arrays;

public class TicTacToe {
    // write your code here
    boolean gameFinished;
    String[][] field;
    String player;
    int countSteps;

    TicTacToe() {
        newGame();
    }

    public void newGame() {
        field = new String[][]{{"-", "-", "-"}, {"-", "-", "-"}, {"-", "-", "-"}};
        player = "X";
        gameFinished = false;
        countSteps = 0;
    }

    public boolean isGameFinished() {
        return gameFinished;
    }

    public String[][] getField() {
        return field;
    }

    public String makeMove(int x, int y) {
        x -= 1;
        y -= 1;
        String check = this.checkGame();
        if (!check.equals("null")) {
            return "Game was ended";
        }
        if (!(field[x][y].equals("-"))) {
            return "Cell " + (x + 1) + ", " + (y + 1) + " is already occupied";
        }
        field[x][y] = player;
        countSteps++;
        check = checkGame();
        if (!check.equals("null")) {
            switch (check) {
                case "X":
                    gameFinished = true;
                    return "Player X won";
                case "0":
                    gameFinished = true;
                    return "Player 0 won";
                case "D":
                    return "Draw";
            }
        }
        player = player.equals("X") ? "0" : "X";
        return "Move completed";
    }

    public String checkGame() {
        if ((field[0][0].equals(field[0][1])) && (field[0][1].equals(field[0][2])) && (!(field[0][0].equals("-"))))
            return field[0][0];
        else if ((field[1][0].equals(field[1][1])) && (field[1][1].equals(field[1][2])) && (!(field[1][0].equals("-"))))
            return field[1][0];
        else if ((field[2][0].equals(field[2][1])) && (field[2][1].equals(field[2][2])) && (!(field[2][0].equals("-"))))
            return field[2][0];
        else if ((field[0][0].equals(field[1][0])) && (field[1][0].equals(field[2][0])) && (!(field[0][0].equals("-"))))
            return field[0][0];
        else if ((field[0][1].equals(field[1][1])) && (field[1][1].equals(field[2][1])) && (!(field[0][1].equals("-"))))
            return field[0][1];
        else if ((field[0][2].equals(field[1][2])) && (field[1][2].equals(field[2][2])) && (!(field[0][2].equals("-"))))
            return field[0][2];
        else if ((field[0][0].equals(field[1][1])) && (field[1][1].equals(field[2][2])) && (!(field[0][0].equals("-"))))
            return field[0][0];
        else if ((field[0][2].equals(field[1][1])) && (field[1][1].equals(field[2][0])) && (!(field[0][2].equals("-"))))
            return field[0][2];
        else if (countSteps == 9)
            return "D";
        return "null";
    }
}



