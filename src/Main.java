public class Main {
    public static void main(String[] args) {
        TicTacToe board = new TicTacToe();

        System.out.println(board.makeMove(1,1));
        System.out.println(board.makeMove(1,1));
        System.out.println(board.makeMove(1,2));
        System.out.println(board.makeMove(2,2));
        System.out.println(board.makeMove(3,1));
        System.out.println(board.makeMove(3,3));
        System.out.println(board.makeMove(2,1));

        System.out.println();
        System.out.println("new game");
        board.newGame();
        System.out.println(board.makeMove(1,1));
        System.out.println(board.makeMove(3,3));
        System.out.println(board.makeMove(1,2));
        System.out.println(board.makeMove(3,2));
        System.out.println(board.makeMove(2,2));
        System.out.println(board.makeMove(3,1));
//
//        board.checkGame()
//        System.out.println(board.makeMove(2,2));
//        System.out.println(board.makeMove(3,1));
//        System.out.println(board.makeMove(3,2));
//        System.out.println(board.makeMove(2,1));
//        System.out.println(board.makeMove(1,2));
//
//        board.checkGame()
//        System.out.println(board.makeMove(1,1));
//        System.out.println(board.makeMove(2,2));
//        System.out.println(board.makeMove(1,2));
//        System.out.println(board.makeMove(1,3));
//        System.out.println(board.makeMove(2,1));
//        System.out.println(board.makeMove(3,1));
//
//        board.checkGame()
//        System.out.println(board.makeMove(2,2));
//        System.out.println(board.makeMove(1,1));
//        System.out.println(board.makeMove(3,1));
//        System.out.println(board.makeMove(1,3));
//        System.out.println(board.makeMove(1,2));
//        System.out.println(board.makeMove(3,2));
//        System.out.println(board.makeMove(2,1));
//        System.out.println(board.makeMove(2,3));
//        System.out.println(board.makeMove(3,3));
//        System.out.println(board.makeMove(1,1));
    }
}
