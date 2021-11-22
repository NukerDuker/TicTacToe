import java.util.Arrays;
import java.util.Scanner;

public class UserInt {
    public static void main(String[] args) {
        TicTacToe test = new TicTacToe();
        test.getField();
        /*while (test.isGameFinished() == false) {
            System.out.println("Введите координаты для шага:");
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(test.makeMove(x,y));;
            System.out.println(test.checkGame());;
            System.out.println(Arrays.deepToString(test.getField()));
        }*/

        /*System.out.println(test.makeMove(0,0));;
        System.out.println(test.checkGame());;
        test.printArr();
        System.out.println(test.makeMove(1,1));;
        System.out.println(test.checkGame());;
        test.printArr();
        System.out.println(test.makeMove(0,1));;
        System.out.println(test.checkGame());;
        test.printArr();
        System.out.println(test.makeMove(0,2));;
        System.out.println(test.checkGame());;
        test.printArr();
        System.out.println(test.makeMove(2,0));;
        System.out.println(test.checkGame());;
        test.printArr();
        System.out.println(test.makeMove(1,0));;
        System.out.println(test.checkGame());;
        test.printArr();
        System.out.println(test.makeMove(1,2));;
        System.out.println(test.checkGame());;
        test.printArr();System.out.println(test.makeMove(2,1));;
        System.out.println(test.checkGame());;
        test.printArr();System.out.println(test.makeMove(2,2));;
        System.out.println(test.checkGame());;
        test.printArr();
        System.out.println(test.makeMove(2,2));*/

        /*TicTacToe board = new TicTacToe();
//*Выводим поле в консоль, используя метод getField();
        System.out.println(board.getField());
        System.out.println(board.makeMove(1, 1));
//*Выводим поле в консоль, используя метод getField();
        System.out.println(board.getField());
        System.out.println(board.makeMove(1, 1));
        System.out.println(board.makeMove(1, 2));
//*Выводим поле в консоль, используя метод getField();
        System.out.println(board.getField());
        System.out.println(board.makeMove(2, 1));
        System.out.println(board.makeMove(2, 2));
        System.out.println(board.makeMove(3, 1));
        System.out.println(board.makeMove(2, 2));
//*Выводим поле в консоль, используя метод getField();
        System.out.println(board.getField());*/

        String check = "";
        TicTacToe game = new TicTacToe();
        game.makeMove(2, 2);
        game.makeMove(1, 1);
        game.makeMove(3, 1);
        game.makeMove(1, 3);
        game.makeMove(1, 2);
        game.makeMove(3, 2);
        game.makeMove(2, 1);
        game.makeMove(2, 3);
        check += game.makeMove(3, 3);
        check += Arrays.deepToString(game.getField());
        check += game.makeMove(1, 1);
        System.out.println(check);
        String res = "Draw[[0, X, 0], [X, X, 0], [X, 0, X]]Game was ended";
        String res = "Draw[[0, X, 0], [X, X, 0], [X, 0, X]]Game was ended";
    }
}
