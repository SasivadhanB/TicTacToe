import java.util.Random;

public class TicTacToe {

    static char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
    };

    static char computerSymbol = 'O';

    public static void main(String[] args) {
        printBoard();
        computerMove();
        printBoard();
    }

    // Computer makes a random valid move
    static void computerMove() {
        Random rand = new Random();
        boolean validMove = false;

        while (!validMove) {
            int slot = rand.nextInt(9) + 1; // 1–9
            int row = (slot - 1) / 3;
            int col = (slot - 1) % 3;

            if (board[row][col] == '-') {
                board[row][col] = computerSymbol;
                validMove = true;
                System.out.println("Computer placed at position: " + slot);
            }
        }
    }

    // Display the board
    static void printBoard() {
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.println(board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
        }
        System.out.println();
    }
}
